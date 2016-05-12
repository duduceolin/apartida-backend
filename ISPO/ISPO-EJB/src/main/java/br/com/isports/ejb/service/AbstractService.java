/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.service;

import br.com.isports.ejb.utils.AbstractDefinition;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dudu
 */
public class AbstractService {

    @PersistenceContext(unitName = AbstractDefinition.NOME_ENTITY_MANAGER_XA)
    protected EntityManager em;

    @PersistenceContext(unitName = AbstractDefinition.NOME_ENTITY_MANAGER_NOXA)
    protected EntityManager emNoXa;

}
