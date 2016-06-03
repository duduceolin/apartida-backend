/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.service;

import br.com.isports.bean.exception.IspoException;
import br.com.isports.bean.funcionalidadeservice.InPesquisarFuncionalidadesPlano;
import br.com.isports.bean.funcionalidadeservice.OutPesquisarFuncionalidadesPlano;
import br.com.isports.ejb.helper.FuncionalidadeHelper;
import br.com.isports.ejb.interceptor.ExceptionInterceptor;
import br.com.apartida.iface.ejb.FuncionalidadeServiceLocal;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;
import org.apache.cxf.annotations.SchemaValidation;

/**
 *
 * @author dudu
 */
@Stateless
@WebService(serviceName = "FuncionalidadeService", targetNamespace = "http://apartida.com.br/servicos/FuncionalidadeService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@SchemaValidation
@Interceptors(ExceptionInterceptor.class)
public class FuncionalidadeService extends AbstractService implements FuncionalidadeServiceLocal {

    @Override
    @WebMethod(operationName = "pesquisarFuncionalidadesPlanoMenu")
    @WebResult(name = "funcionalidadesMenu")
    public OutPesquisarFuncionalidadesPlano pesquisarFuncionalidadesPlanoMenu(@WebParam(name = "InPesquisarFuncionalidadesPlano") @XmlElement(required = true) InPesquisarFuncionalidadesPlano inPesquisar) throws IspoException {
        return new FuncionalidadeHelper().pesquisarFuncionalidadesPlanoMenu(emNoXa, inPesquisar.getIdPlano());
    }

}
