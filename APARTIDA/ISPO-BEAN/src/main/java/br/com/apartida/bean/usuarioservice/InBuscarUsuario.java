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
@XmlAccessorType(XmlAccessType.FIELD)
public class InBuscarUsuario implements Serializable {

    private static final long serialVersionUID = -5660662245439342343L;

    @XmlElement(required = true)
    private BuscarUsuarioDTO dadosBuscarUsuario;

    public BuscarUsuarioDTO getDadosBuscarUsuario() {
        return dadosBuscarUsuario;
    }

    public void setDadosBuscarUsuario(BuscarUsuarioDTO dadosBuscarUsuario) {
        this.dadosBuscarUsuario = dadosBuscarUsuario;
    }

}
