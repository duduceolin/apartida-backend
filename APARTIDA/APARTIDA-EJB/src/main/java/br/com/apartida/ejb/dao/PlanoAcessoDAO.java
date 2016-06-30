/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.dao;

import br.com.apartida.entity.dtos.FuncionalidadeMenuDTO;
import br.com.apartida.entity.entities.Funcionalidade;
import br.com.apartida.entity.entities.PlanoAcesso;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author dudu
 */
public class PlanoAcessoDAO extends GenericDAO<PlanoAcesso, Long> {

    public PlanoAcessoDAO() {
        super(PlanoAcesso.class);
    }

    public List<FuncionalidadeMenuDTO> pesquisarFuncionalidadesPeloPlano(EntityManager emNoXa, Long idPlano) {

        TypedQuery<FuncionalidadeMenuDTO> query = emNoXa.createNamedQuery(PlanoAcesso.PESQUISAR_FUNCIONALIDADES_PAI, FuncionalidadeMenuDTO.class);
        query.setParameter("idPlano", idPlano);

        return query.getResultList();
    }

    public List<FuncionalidadeMenuDTO> pesquisarSubFuncionalidades(EntityManager emNoXa, Long idFuncionalidadePai) {

        TypedQuery<FuncionalidadeMenuDTO> query = emNoXa.createNamedQuery(PlanoAcesso.PESQUISAR_SUBFUNCIONALIDADES, FuncionalidadeMenuDTO.class);
        query.setParameter("idFuncionalidadePai", idFuncionalidadePai);

        return query.getResultList();
    }

}
