/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.perfilservice;

import br.com.apartida.bean.empresaservice.EmpresaDTO;
import br.com.apartida.bean.funcionalidadeservice.FuncionalidadeDTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dudu
 */
public class PerfilDTO implements Serializable {

    private static final long serialVersionUID = 8194413719368401925L;

    private Long id;
    private EmpresaDTO empresa;
    private String nome;
    private Boolean isAdmin;
    private List<FuncionalidadeDTO> funcionalidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmpresaDTO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDTO empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<FuncionalidadeDTO> getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(List<FuncionalidadeDTO> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
