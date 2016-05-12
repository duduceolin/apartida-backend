/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.usuarioservice;

import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class OutBuscarUsuario implements Serializable {

    private static final long serialVersionUID = -6350123284077411012L;

    private UsuarioDTO usuario;

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

}
