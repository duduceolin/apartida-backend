/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.iface.ejb;

import br.com.apartida.bean.usuarioservice.InBuscarUsuario;
import br.com.apartida.bean.usuarioservice.OutBuscarUsuario;
import br.com.apartida.bean.exception.IspoException;

/**
 *
 * @author dudu
 */
public interface UsuarioServiceLocal {

    public OutBuscarUsuario buscarUsuario(InBuscarUsuario inBuscarUsuario) throws IspoException;
}
