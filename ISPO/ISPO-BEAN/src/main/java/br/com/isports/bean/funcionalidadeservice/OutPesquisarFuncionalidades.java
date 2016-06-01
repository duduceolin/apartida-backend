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
public class OutPesquisarFuncionalidades implements Serializable {

    private static final long serialVersionUID = -3934592406373112177L;

    private List<FuncionalidadeDTO> funcionalidades;

    public List<FuncionalidadeDTO> getFuncionalidades() {
        return funcionalidades;
    }

    public void setFuncionalidades(List<FuncionalidadeDTO> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

}
