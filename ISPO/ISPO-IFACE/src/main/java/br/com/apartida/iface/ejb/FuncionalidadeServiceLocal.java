/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.iface.ejb;

import br.com.apartida.bean.exception.IspoException;
import br.com.apartida.bean.funcionalidadeservice.InPesquisarFuncionalidadesPlano;
import br.com.apartida.bean.funcionalidadeservice.OutPesquisarFuncionalidadesPlano;

/**
 *
 * @author dudu
 */
public interface FuncionalidadeServiceLocal {

    public OutPesquisarFuncionalidadesPlano pesquisarFuncionalidadesPlanoMenu(InPesquisarFuncionalidadesPlano inPesquisar) throws IspoException;

}
