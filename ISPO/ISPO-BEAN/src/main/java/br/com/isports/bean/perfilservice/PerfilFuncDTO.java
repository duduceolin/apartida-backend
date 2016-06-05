/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.perfilservice;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dudu
 */
public class PerfilFuncDTO implements Serializable {

    private static final long serialVersionUID = 1861639498436005388L;

    private Long id;
    private String nome;
    private Boolean isAdmin;
    private List<FuncionalidadePerfilDTO> funcionalidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<FuncionalidadePerfilDTO> getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(List<FuncionalidadePerfilDTO> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

}
