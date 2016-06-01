/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.empresaservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author dudu
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class InPesquisarPelaEmpresa implements Serializable {

    private static final long serialVersionUID = -2360823171359906866L;

    @XmlElement(required = true)
    private Long idEmpresa;

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

}
