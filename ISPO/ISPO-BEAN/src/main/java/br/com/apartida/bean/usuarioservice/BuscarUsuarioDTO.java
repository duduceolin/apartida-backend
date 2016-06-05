/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.usuarioservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dudu
 */
@XmlRootElement(name = "BuscarUsuarioDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class BuscarUsuarioDTO implements Serializable {

    private static final long serialVersionUID = -6891377031098433157L;

    @XmlElement(required = true)
    private String login;

    @XmlElement(required = true)
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
