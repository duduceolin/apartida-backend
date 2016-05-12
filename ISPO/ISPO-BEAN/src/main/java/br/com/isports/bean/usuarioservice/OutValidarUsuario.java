/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.usuarioservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dudu
 */
public class OutValidarUsuario implements Serializable {

    private static final long serialVersionUID = -6350123284077411012L;

    private Boolean usuarioValido;

    public Boolean getUsuarioValido() {
        return usuarioValido;
    }

    public void setUsuarioValido(Boolean usuarioValido) {
        this.usuarioValido = usuarioValido;
    }

}
