/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.iface.ejb;

import br.com.isports.bean.usuarioservice.InValidarUsuario;
import br.com.isports.bean.usuarioservice.OutValidarUsuario;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author dudu
 */
public interface UsuarioServiceLocal {

    public Integer buscarTotalUsuario();

    public void cadastrarUsuario();
    
    public OutValidarUsuario validarUsuario(@XmlElement(required = true) InValidarUsuario inValidarUsuario);
}
