/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.iface.ejb;
import br.com.apartida.bean.exception.IspoException;
import br.com.apartida.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.apartida.bean.perfilservice.InCadastrarAlterarPerfil;
import br.com.apartida.bean.perfilservice.OutCadastrarAlterarPerfil;
import br.com.apartida.bean.perfilservice.OutPesquisarPerfis;



/**
 *
 * @author dudu
 */
public interface PerfilServiceLocal {
    
    public OutPesquisarPerfis pesquisarPerfisEmpresa(InPesquisarPelaEmpresa inPesquisar) throws IspoException;

    public OutCadastrarAlterarPerfil cadastrarAlterarPerfil(InCadastrarAlterarPerfil inCadastrar) throws IspoException;

}
