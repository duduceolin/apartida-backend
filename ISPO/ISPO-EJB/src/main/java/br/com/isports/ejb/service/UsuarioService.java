/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.service;

import br.com.isports.bean.usuarioservice.InBuscarUsuario;
import br.com.isports.bean.usuarioservice.InValidarUsuario;
import br.com.isports.bean.usuarioservice.OutBuscarUsuario;
import br.com.isports.bean.usuarioservice.OutValidarUsuario;
import br.com.isports.ejb.dao.UsuarioDAO;
import br.com.isports.ejb.helper.UsuarioHelper;
import br.com.isports.entity.entities.Usuario;
import br.com.isports.iface.ejb.UsuarioServiceLocal;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.transaction.Transactional;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author dudu
 */
@Stateless
@WebService(serviceName = "UsuarioService", targetNamespace = "http://isoccer.com.br/servicos/UsuarioService")
public class UsuarioService extends AbstractService implements UsuarioServiceLocal {

    @Override
    @WebMethod(operationName = "buscarUsuario")
    @WebResult(name = "usuario")
    public OutBuscarUsuario buscarUsuario(@XmlElement(required = true, name = "inBuscarUsuario") InBuscarUsuario inBuscar) {
        UsuarioHelper helper = new UsuarioHelper();
        return helper.buscarUsuarioLoginSenha(emNoXa, inBuscar);
    }

    @Override
    @WebMethod(operationName = "validarUsuario")
    @WebResult(name = "usuarioValido")
    public OutValidarUsuario validarUsuario(@XmlElement(required = true, name = "inValidarUsuario") InValidarUsuario inValidarUsuario) {
        UsuarioHelper helper = new UsuarioHelper();
        return helper.validarUsuario(emNoXa, inValidarUsuario);
    }

    @Override
    @WebMethod(operationName = "cadastrarUsuario")
    @WebResult(name = "cadastrarUsuario")
    @Transactional
    public void cadastrarUsuario() {
//        UsuarioDAO dao = new UsuarioDAO();
//        Usuario usuario = new Usuario();
//        usuario.setAdmin("S");
//        usuario.setNome("teste insercao");
//        usuario.setLogin("testeinsert");
//        usuario.setSenha("123123");
//        dao.cadastrarUsuario(em, usuario);
    }

}
