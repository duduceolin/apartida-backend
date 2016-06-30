/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.funcionalidadeservice;

import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class FuncionalidadeDTO implements Serializable {

    private static final long serialVersionUID = 5692973891333695030L;

    private Long idFuncionalidade;
    private Long idMenuPai;
    private String nome;
    private String icone;

    public Long getIdFuncionalidade() {
        return idFuncionalidade;
    }

    public void setIdFuncionalidade(Long idFuncionalidade) {
        this.idFuncionalidade = idFuncionalidade;
    }

    public Long getIdMenuPai() {
        return idMenuPai;
    }

    public void setIdMenuPai(Long idMenuPai) {
        this.idMenuPai = idMenuPai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

}
