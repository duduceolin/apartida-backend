/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.helper;

import br.com.isports.bean.usuarioservice.InBuscarUsuario;
import br.com.isports.bean.usuarioservice.InValidarUsuario;
import br.com.isports.bean.usuarioservice.OutBuscarUsuario;
import br.com.isports.bean.usuarioservice.OutValidarUsuario;
import br.com.isports.bean.usuarioservice.UsuarioDTO;
import br.com.isports.ejb.converter.UsuarioConverter;
import br.com.isports.ejb.dao.UsuarioDAO;
import br.com.isports.entity.entities.Usuario;
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

    public OutBuscarUsuario buscarUsuarioLoginSenha(EntityManager emNoXa, InBuscarUsuario inBuscar) {

        OutBuscarUsuario out = new OutBuscarUsuario();
        UsuarioDTO dto = null;

        Usuario usuario = usuarioDAO.buscarUsuarioLoginSenha(emNoXa, inBuscar.getDados().getLogin(), inBuscar.getDados().getSenha());

        if (usuario != null) {
            dto = UsuarioConverter.entityToDTO(usuario);
        }

        out.setUsuario(dto);
        return out;
    }

}
