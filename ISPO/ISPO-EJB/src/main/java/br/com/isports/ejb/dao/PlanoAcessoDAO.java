/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.dao;

import br.com.isports.entity.entities.Funcionalidade;
import br.com.isports.entity.entities.PlanoAcesso;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author dudu
 */
public class PlanoAcessoDAO extends GenericDAO<PlanoAcesso, Long> {

    public PlanoAcessoDAO(){
        super(PlanoAcesso.class);
    }
    
    public List<Funcionalidade> pesquisarFuncionalidadesPeloPlano(EntityManager emNoXa, Long idPlano) {

        TypedQuery<Funcionalidade> query = emNoXa.createNamedQuery(PlanoAcesso.PESQUISAR_FUNCIONALIDADES, Funcionalidade.class);
        query.setParameter("idPlano", idPlano);

        return query.getResultList();
    }

}
