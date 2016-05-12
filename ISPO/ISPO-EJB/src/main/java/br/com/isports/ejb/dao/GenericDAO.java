package br.com.isports.ejb.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.validation.Valid;

public abstract class GenericDAO<T, I extends Serializable> {

   protected EntityManager em;
   protected EntityManager emNoXa;

   private Class<T> persistedClass;

   protected GenericDAO() {
   }

   protected GenericDAO(Class<T> persistedClass) {
       this();
       this.persistedClass = persistedClass;
   }

   public T salvar(@Valid T entity) {
       em.persist(entity);
       em.flush();
       return entity;
   }

   public T atualizar(@Valid T entity) {
       em.merge(entity);
       em.flush();
       return entity;
   }

   public void remover(I id) {
       T entity = encontrar(id);
       T mergedEntity = em.merge(entity);
       em.remove(mergedEntity);
       em.flush();
   }

   public List<T> getList() {
       CriteriaBuilder builder = emNoXa.getCriteriaBuilder();
       CriteriaQuery<T> query = builder.createQuery(persistedClass);
       query.from(persistedClass);
       return emNoXa.createQuery(query).getResultList();
   }

   public T encontrar(I id) {
       return emNoXa.find(persistedClass, id);
   }
}