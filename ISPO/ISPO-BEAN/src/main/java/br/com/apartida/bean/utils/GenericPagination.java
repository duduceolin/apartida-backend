/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.utils;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author dudu
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GenericPagination implements Serializable {

    private static final long serialVersionUID = 7144369234773514012L;

    @XmlElement(required = true)
    private Integer primeiro;
    
    @XmlElement(required = true)
    private Integer tamanho;

    public Integer getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Integer primeiro) {
        this.primeiro = primeiro;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

}
