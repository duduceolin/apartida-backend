/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.dao;

import br.com.apartida.entity.entities.PerfilAcesso;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author dudu
 */
public class PerfilAcessoDAO extends GenericDAO<PerfilAcesso, Long> {

    public PerfilAcessoDAO() {
        super(PerfilAcesso.class);
    }

    public void cadastrarPerfilAcesso(EntityManager em, PerfilAcesso perfilAcesso) {
        this.em = em;
        this.salvar(perfilAcesso);
    }

    public void removerPerfilAcesso(EntityManager em, Long idPerfil) {
        Query query = em.createNamedQuery(PerfilAcesso.REMOVER_ACESSOS);
        query.setParameter("idPerfil", idPerfil);
        query.executeUpdate();
    }

}
