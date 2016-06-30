/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.service;

import br.com.apartida.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.apartida.bean.exception.IspoException;
import br.com.apartida.bean.perfilservice.OutPesquisarPerfis;
import br.com.apartida.ejb.helper.PerfilHelper;
import br.com.apartida.ejb.interceptor.ExceptionInterceptor;
import br.com.apartida.iface.ejb.PerfilServiceLocal;
import br.com.apartida.bean.perfilservice.InCadastrarAlterarPerfil;
import br.com.apartida.bean.perfilservice.OutCadastrarAlterarPerfil;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.transaction.Transactional;
import javax.xml.bind.annotation.XmlElement;
import org.apache.cxf.annotations.SchemaValidation;
import org.slf4j.Logger;

/**
 *
 * @author dudu
 */
@Stateless
@WebService(serviceName = "PerfilService", targetNamespace = "http://apartida.com.br/servicos/PerfilService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@SchemaValidation
@Interceptors(ExceptionInterceptor.class)
public class PerfilService extends AbstractService implements PerfilServiceLocal {

    @Inject
    protected Logger logger;

    @Override
    @WebMethod(operationName = "pesquisarPerfisPelaEmpresa")
    @WebResult(name = "perfis")
    public OutPesquisarPerfis pesquisarPerfisEmpresa(@XmlElement(required = true) @WebParam(name = "inPesquisarPerfis") InPesquisarPelaEmpresa inPesquisar) throws IspoException {
        OutPesquisarPerfis out = new OutPesquisarPerfis();
        out.setPerfis(new PerfilHelper().pesquisarPerfis(emNoXa, inPesquisar));
        return out;
    }

    @Override
    @Transactional
    @WebMethod(operationName = "cadastrarAlterarPerfil")
    @WebResult(name = "status")
    public OutCadastrarAlterarPerfil cadastrarAlterarPerfil(@XmlElement(required = true) @WebParam(name = "inCadastrarAlterarPerfil") InCadastrarAlterarPerfil inCadastrar) throws IspoException {
        OutCadastrarAlterarPerfil out = new OutCadastrarAlterarPerfil();
        out.setStatus(new PerfilHelper().cadastrarAlterarPerfil(em, inCadastrar));
        return out;
    }

}
