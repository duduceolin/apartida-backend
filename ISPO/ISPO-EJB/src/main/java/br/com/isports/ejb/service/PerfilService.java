/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.service;

import br.com.isports.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.isports.bean.exception.IspoException;
import br.com.isports.bean.perfilservice.OutPesquisarPerfis;
import br.com.isports.ejb.helper.PerfilHelper;
import br.com.isports.ejb.interceptor.ExceptionInterceptor;
import br.com.isports.iface.ejb.PerfilServiceLocal;
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
        return new PerfilHelper().pesquisarPerfis(emNoXa, inPesquisar.getIdEmpresa());
    }

}
