/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.perfilservice;

import br.com.apartida.bean.funcionalidadeservice.FuncionalidadeDTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dudu
 */
public class InCadastrarAlterarPerfil implements Serializable {

    private static final long serialVersionUID = 997344015999353786L;

    private Long id;
    private Long idEmpresa;
    private String nome;
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
