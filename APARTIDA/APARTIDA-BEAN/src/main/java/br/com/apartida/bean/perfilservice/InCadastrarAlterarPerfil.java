/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.perfilservice;

import br.com.apartida.bean.funcionalidadeservice.FuncionalidadeDTO;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author dudu
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class InCadastrarAlterarPerfil implements Serializable {

    private static final long serialVersionUID = 997344015999353786L;

    @XmlElement(required = true)
    private Long id;
    
    @XmlElement(required = true)
    private Long idEmpresa;
    
    @XmlElement(required = true)
    private String nome;
    
    @XmlElement(required = true)
    private Boolean admin;
    
    private List<FuncionalidadeDTO> acessos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public List<FuncionalidadeDTO> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<FuncionalidadeDTO> acessos) {
        this.acessos = acessos;
    }

}
