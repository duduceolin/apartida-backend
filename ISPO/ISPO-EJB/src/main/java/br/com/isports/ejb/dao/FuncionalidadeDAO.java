/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.dao;

import br.com.isports.entity.entities.Funcionalidade;

/**
 *
 * @author dudu
 */
public class FuncionalidadeDAO extends GenericDAO<Funcionalidade, Long> {

    public FuncionalidadeDAO() {
        super(Funcionalidade.class);
    }
}
