/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.exception;

import br.com.apartida.bean.exception.IspoException;

/**
 *
 * @author dudu
 */
public abstract class ConfigExceptionFactory {

    public static IspoException criarException(ConfigExceptions exception) {
        if (exception == null) {
            throw new IllegalArgumentException("É obrigatório informar a exceção a ser lançada.");
        }

        return new IspoException(exception.name(), exception.getDescricao(), exception.getTipoErro());
    }

}
