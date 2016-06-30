/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.funcionalidadeservice;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dudu
 */
public class OutPesquisarFuncionalidadesPlano implements Serializable {

    private static final long serialVersionUID = -4019757741437753588L;

    private List<FuncionalidadeToMenuDTO> menu;

    public List<FuncionalidadeToMenuDTO> getMenu() {
        return menu;
    }

    public void setMenu(List<FuncionalidadeToMenuDTO> menu) {
        this.menu = menu;
    }

}
