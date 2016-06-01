/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.helper;

import br.com.isports.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.isports.bean.exception.IspoException;
import br.com.isports.bean.funcionalidadeservice.FuncionalidadeDTO;
import br.com.isports.bean.funcionalidadeservice.InPesquisarFuncionalidades;
import br.com.isports.bean.funcionalidadeservice.OutPesquisarFuncionalidades;
import br.com.isports.ejb.converter.FuncionalidadeConverter;
import br.com.isports.ejb.dao.EmpresaDAO;
import br.com.isports.ejb.dao.PlanoAcessoDAO;
import br.com.isports.entity.entities.Empresa;
import br.com.isports.entity.entities.Funcionalidade;
import br.com.isports.entity.entities.PlanoAcesso;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author dudu
 */
public class FuncionalidadeHelper extends AbstractHelper {

    public OutPesquisarFuncionalidades pesquisarFuncionalidadesPeloPlano(EntityManager emNoXa, InPesquisarFuncionalidades inPesquisar) throws IspoException {
        PlanoAcessoDAO dao = new PlanoAcessoDAO();
        OutPesquisarFuncionalidades out = new OutPesquisarFuncionalidades();
        out.setFuncionalidades(new ArrayList<FuncionalidadeDTO>());

        List<Funcionalidade> funcionalidades = dao.pesquisarFuncionalidadesPeloPlano(emNoXa, inPesquisar.getIdPlano());

        for (Funcionalidade funcionalidade : funcionalidades) {
            out.getFuncionalidades().add(FuncionalidadeConverter.entityToDTO(funcionalidade));
        }

        return out;
    }

    public OutPesquisarFuncionalidades pesquisarFuncionalidadesPelaEmpresa(EntityManager emNoXa, Long idEmpresa) throws IspoException {
        OutPesquisarFuncionalidades out = new OutPesquisarFuncionalidades();
        out.setFuncionalidades(new ArrayList<FuncionalidadeDTO>());

        Empresa empresa = new EmpresaDAO().buscarEmpresa(emNoXa, idEmpresa);

        for (PlanoAcesso acesso : empresa.getPlano().getAcessos()) {
            out.getFuncionalidades().add(FuncionalidadeConverter.entityToDTO(acesso.getFuncionalidade()));
        }

        return out;
    }

}
