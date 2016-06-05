/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.helper;

import br.com.apartida.entity.dtos.FuncionalidadeMenuDTO;
import br.com.isports.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.isports.bean.exception.IspoException;
import br.com.isports.bean.funcionalidadeservice.FuncionalidadeDTO;
import br.com.isports.bean.funcionalidadeservice.InPesquisarFuncionalidades;
import br.com.isports.bean.funcionalidadeservice.OutPesquisarFuncionalidades;
import br.com.isports.ejb.converter.FuncionalidadeConverter;
import br.com.isports.ejb.dao.EmpresaDAO;
import br.com.isports.ejb.dao.PlanoAcessoDAO;
import br.com.apartida.entity.entities.Empresa;
import br.com.apartida.entity.entities.Funcionalidade;
import br.com.apartida.entity.entities.PlanoAcesso;
import br.com.isports.bean.funcionalidadeservice.FuncionalidadeToMenuDTO;
import br.com.isports.bean.funcionalidadeservice.OutPesquisarFuncionalidadesPlano;
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

        //List<Funcionalidade> funcionalidades = dao.pesquisarFuncionalidadesPeloPlano(emNoXa, inPesquisar.getIdPlano());
//        for (Funcionalidade funcionalidade : funcionalidades) {
//            out.getFuncionalidades().add(FuncionalidadeConverter.entityToDTO(funcionalidade));
//        }
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

    public OutPesquisarFuncionalidadesPlano pesquisarFuncionalidadesPlanoMenu(EntityManager emNoXa, Long idPlano) throws IspoException {
        OutPesquisarFuncionalidadesPlano out = new OutPesquisarFuncionalidadesPlano();
        out.setMenu(new ArrayList<FuncionalidadeToMenuDTO>());
        PlanoAcessoDAO dao = new PlanoAcessoDAO();

        List<FuncionalidadeMenuDTO> lista = dao.pesquisarFuncionalidadesPeloPlano(emNoXa, idPlano);

        if (null != lista && lista.size() > 0) {
            for (FuncionalidadeMenuDTO menu : lista) {
                menu.setSubFuncionalidades(dao.pesquisarSubFuncionalidades(emNoXa, menu.getIdFuncionalidade()));
                out.getMenu().add(FuncionalidadeConverter.converterMenuToDTO(menu));
            }
        }
        
        return out;
    }

}
