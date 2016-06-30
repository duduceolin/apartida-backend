/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.planoservice;

import br.com.apartida.bean.funcionalidadeservice.FuncionalidadeDTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dudu
 */
public class PlanoDTO implements Serializable {

    private static final long serialVersionUID = 2525086654978717110L;

    private Long id;
    private String nome;
    private List<FuncionalidadeDTO> funcionalidades;

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

    public List<FuncionalidadeDTO> getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(List<FuncionalidadeDTO> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

}
