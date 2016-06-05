/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.exception;


/**
 *
 * @author dudu
 */
public class IspoException extends Exception {

    private static final long serialVersionUID = 4503488163691685332L;

    public IspoException() {

    }

    public IspoException(String codigo, String mensagem, TipoErro tipo) {
        super(tipo.name() + " - " + codigo + ": " + mensagem);
    }
}
