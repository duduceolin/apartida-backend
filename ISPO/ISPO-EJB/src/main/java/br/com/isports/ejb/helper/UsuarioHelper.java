/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.helper;

import br.com.isports.bean.usuarioservice.InValidarUsuario;
import br.com.isports.bean.usuarioservice.OutValidarUsuario;
import br.com.isports.ejb.dao.UsuarioDAO;
import javax.persistence.EntityManager;

/**
 *
 * @author dudu
 */
public class UsuarioHelper {

    UsuarioDAO usuarioDAO;

    public UsuarioHelper() {
        usuarioDAO = new UsuarioDAO();
    }

    public OutValidarUsuario validarUsuario(EntityManager emNoXa, InValidarUsuario inValidar) {
        OutValidarUsuario out = new OutValidarUsuario();

        Boolean usuarioValido = usuarioDAO.validarUsuario(emNoXa, inValidar.getDados().getLogin(), inValidar.getDados().getSenha());

        out.setUsuarioValido(usuarioValido);

        return out;
    }

}
