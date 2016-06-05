/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.dao;

import br.com.apartida.entity.entities.Perfil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author dudu
 */
public class PerfilDAO extends GenericDAO<Perfil, Long> {

    public PerfilDAO() {
        super(Perfil.class);
    }

    public List<Perfil> pesquisarPerfisPelaEmpresa(EntityManager emNoXa, Long idEmpresa, Integer primeiro, Integer tamanho) {
        TypedQuery<Perfil> query = emNoXa.createNamedQuery(Perfil.CONSULTAR_PERFIS, Perfil.class);
        query.setParameter("idEmpresa", idEmpresa);
        query.setFirstResult(primeiro);
        query.setMaxResults(tamanho);
        return query.getResultList();
    }

    public Perfil cadastrarAtualizarPerfil(EntityManager em, Perfil perfil) {
        this.em = em;

        if (perfil.getId() != null) {
            return this.atualizar(perfil);
        } else {
            return this.salvar(perfil);
        }
    }

}
