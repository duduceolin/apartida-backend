/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dudu
 */
public abstract class AbstractService {

    protected EntityManager em;
    protected EntityManager emNoXa;

    public AbstractService() {

//
//        EntityManagerFactory factoryNOXA = Persistence.createEntityManagerFactory(AbstractDefinition.NOME_ENTITY_MANAGER_NOXA);
//        emNoXa = factoryNOXA.createEntityManager();

    }

}
