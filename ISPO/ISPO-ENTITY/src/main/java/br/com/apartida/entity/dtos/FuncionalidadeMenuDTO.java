/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.entity.dtos;

import java.util.List;

/**
 *
 * @author dudu
 */
public class FuncionalidadeMenuDTO {

    private Long idFuncionalidade;
    private String nome;
    private String url;
    private String icone;
    private List<FuncionalidadeMenuDTO> subFuncionalidades;

    public FuncionalidadeMenuDTO() {

    }

    public FuncionalidadeMenuDTO(Long idFuncionalidade, String nome, String url, String icone) {
        this.idFuncionalidade = idFuncionalidade;
        this.nome = nome;
        this.url = url;
        this.icone = icone;
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

    public List<FuncionalidadeMenuDTO> getSubFuncionalidades() {
        return subFuncionalidades;
    }

    public void setSubFuncionalidades(List<FuncionalidadeMenuDTO> subFuncionalidades) {
        this.subFuncionalidades = subFuncionalidades;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

}
