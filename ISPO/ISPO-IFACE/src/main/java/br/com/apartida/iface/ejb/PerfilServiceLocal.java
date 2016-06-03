/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.iface.ejb;
import br.com.isports.bean.exception.IspoException;
import br.com.isports.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.isports.bean.perfilservice.OutPesquisarPerfis;



/**
 *
 * @author dudu
 */
public interface PerfilServiceLocal {
    
    public OutPesquisarPerfis pesquisarPerfisEmpresa(InPesquisarPelaEmpresa inPesquisar) throws IspoException;
}
