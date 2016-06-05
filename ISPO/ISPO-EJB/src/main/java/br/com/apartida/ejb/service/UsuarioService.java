/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.service;

import br.com.apartida.bean.usuarioservice.InBuscarUsuario;
import br.com.apartida.bean.usuarioservice.InValidarUsuario;
import br.com.apartida.bean.usuarioservice.OutBuscarUsuario;
import br.com.apartida.bean.usuarioservice.OutValidarUsuario;
import br.com.apartida.bean.exception.IspoException;
import br.com.apartida.ejb.helper.UsuarioHelper;
import br.com.apartida.ejb.interceptor.ExceptionInterceptor;
import br.com.apartida.iface.ejb.UsuarioServiceLocal;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;
import org.apache.cxf.annotations.SchemaValidation;
import org.slf4j.Logger;

/**
 *
 * @author dudu
 */
@Stateless
@WebService(serviceName = "UsuarioService", targetNamespace = "http://apartida.com.br/servicos/UsuarioService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@SchemaValidation
@Interceptors(ExceptionInterceptor.class)
public class UsuarioService extends AbstractService implements UsuarioServiceLocal {

    @Inject
    protected Logger logger;

    @Override
    @WebMethod(operationName = "buscarUsuario")
    @WebResult(name = "usuario")
    public OutBuscarUsuario buscarUsuario(@XmlElement(required = true) @WebParam(name = "inBuscarUsuario") InBuscarUsuario inBuscarUsuario) throws IspoException {
        UsuarioHelper helper = new UsuarioHelper();
        return helper.buscarUsuarioLoginSenha(emNoXa, inBuscarUsuario);
    }

}
