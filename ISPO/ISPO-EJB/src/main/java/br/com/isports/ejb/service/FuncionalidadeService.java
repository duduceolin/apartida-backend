/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.service;

import br.com.isports.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.isports.bean.exception.IspoException;
import br.com.isports.bean.funcionalidadeservice.InPesquisarFuncionalidades;
import br.com.isports.bean.funcionalidadeservice.OutPesquisarFuncionalidades;
import br.com.isports.ejb.helper.FuncionalidadeHelper;
import br.com.isports.ejb.interceptor.ExceptionInterceptor;
import br.com.isports.iface.ejb.FuncionalidadeServiceLocal;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
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
public class FuncionalidadeService extends AbstractService implements FuncionalidadeServiceLocal{

    @Override
    public OutPesquisarFuncionalidades pesquisarFuncionalidadesEmpresa(InPesquisarPelaEmpresa inPesquisar) throws IspoException {
        return new FuncionalidadeHelper().pesquisarFuncionalidadesPelaEmpresa(emNoXa, inPesquisar.getIdEmpresa());
    }
    
}
