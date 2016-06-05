/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.dao;

import br.com.apartida.entity.entities.Empresa;
import javax.persistence.EntityManager;

/**
 *
 * @author dudu
 */
public class EmpresaDAO extends GenericDAO<Empresa, Long> {

    public EmpresaDAO() {
        super(Empresa.class);
    }

    public Empresa buscarEmpresa(EntityManager emNoXa, Long idEmpresa) {
        this.emNoXa = emNoXa;
        return encontrar(idEmpresa);
    }

}
