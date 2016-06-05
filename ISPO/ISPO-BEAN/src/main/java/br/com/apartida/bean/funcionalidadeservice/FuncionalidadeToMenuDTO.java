/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.funcionalidadeservice;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dudu
 */
public class FuncionalidadeToMenuDTO implements Serializable {

    private static final long serialVersionUID = -7692776342460862157L;

    private Long idFuncionalidade;
    private String nome;
    private String url;
    private String icone;
    private List<FuncionalidadeToMenuDTO> subFuncionalidades;

    public FuncionalidadeToMenuDTO() {

    }

    public FuncionalidadeToMenuDTO(Long idFuncionalidade, String nome, String url, List<FuncionalidadeToMenuDTO> subFuncionalidades) {
        this.idFuncionalidade = idFuncionalidade;
        this.nome = nome;
        this.url = url;
        this.subFuncionalidades = subFuncionalidades;
    }

    public FuncionalidadeToMenuDTO(Long idFuncionalidade, String nome, String url) {
        this.idFuncionalidade = idFuncionalidade;
        this.nome = nome;
        this.url = url;
    }

    public Long getIdFuncionalidade() {
        return idFuncionalidade;
    }

    public void setIdFuncionalidade(Long idFuncionalidade) {
        this.idFuncionalidade = idFuncionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<FuncionalidadeToMenuDTO> getSubFuncionalidades() {
        return subFuncionalidades;
    }

    public void setSubFuncionalidades(List<FuncionalidadeToMenuDTO> subFuncionalidades) {
        this.subFuncionalidades = subFuncionalidades;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

}
