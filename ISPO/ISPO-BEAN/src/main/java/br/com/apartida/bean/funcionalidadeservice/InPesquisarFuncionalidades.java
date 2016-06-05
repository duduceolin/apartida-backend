/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.funcionalidadeservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author dudu
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class InPesquisarFuncionalidades implements Serializable {

    private static final long serialVersionUID = -8343879231683401116L;

    @XmlElement(required = true)
    private Long idPlano;

    public Long getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }

}
