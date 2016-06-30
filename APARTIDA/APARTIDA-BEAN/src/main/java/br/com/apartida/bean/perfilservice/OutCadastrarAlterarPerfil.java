/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.perfilservice;

import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class OutCadastrarAlterarPerfil implements Serializable {

    private static final long serialVersionUID = 6893577545379172160L;

    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
