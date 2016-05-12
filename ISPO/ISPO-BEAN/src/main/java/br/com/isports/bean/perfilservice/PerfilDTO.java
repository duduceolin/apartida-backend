/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.perfilservice;

import br.com.isports.bean.empresaservice.EmpresaDTO;
import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class PerfilDTO implements Serializable {

    private static final long serialVersionUID = 8194413719368401925L;

    private Integer id;
    private EmpresaDTO empresa;
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

}
