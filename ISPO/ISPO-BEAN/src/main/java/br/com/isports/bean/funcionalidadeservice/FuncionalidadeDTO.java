/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.funcionalidadeservice;

import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class FuncionalidadeDTO implements Serializable {

    private static final long serialVersionUID = 5361288547963813636L;

    private Long idFuncionalidade;
    private String nome;
    private String url;
    private Long idMenuPai;

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

    public Long getIdMenuPai() {
        return idMenuPai;
    }

    public void setIdMenuPai(Long idMenuPai) {
        this.idMenuPai = idMenuPai;
    }

}
