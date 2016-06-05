/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.helper;

import br.com.apartida.entity.entities.Perfil;
import br.com.apartida.entity.entities.PerfilAcesso;
import br.com.apartida.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.apartida.bean.exception.IspoException;
import br.com.apartida.bean.funcionalidadeservice.FuncionalidadeDTO;
import br.com.apartida.bean.perfilservice.InCadastrarAlterarPerfil;
import br.com.apartida.bean.perfilservice.PerfilFuncDTO;
import br.com.apartida.ejb.converter.FuncionalidadeConverter;
import br.com.apartida.ejb.converter.PerfilConverter;
import br.com.apartida.ejb.dao.PerfilAcessoDAO;
import br.com.apartida.ejb.dao.PerfilDAO;
import br.com.apartida.ejb.exception.ConfigExceptionFactory;
import br.com.apartida.ejb.exception.ConfigExceptions;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author dudu
 */
public class PerfilHelper extends AbstractHelper {

    public List<PerfilFuncDTO> pesquisarPerfis(EntityManager emNoXa, InPesquisarPelaEmpresa inPesquisar) throws IspoException {
        
        PerfilDAO dao = new PerfilDAO();
        List<Perfil> lista = dao.pesquisarPerfisPelaEmpresa(emNoXa, inPesquisar.getIdEmpresa(), 
                inPesquisar.getPrimeiro(), inPesquisar.getTamanho());
        List<PerfilFuncDTO> retorno = new ArrayList<>();
        
        if (null != lista){
            retorno = PerfilConverter.entityToPerfilFuncDTO(lista);
        } else{
            throw ConfigExceptionFactory.criarException(ConfigExceptions.ERRO003);
        }

        return retorno;
    }
    
    public Boolean cadastrarAlterarPerfil(EntityManager em, InCadastrarAlterarPerfil in) throws IspoException{
        PerfilDAO perfilDAO = new PerfilDAO();
        PerfilAcessoDAO perfilAcessoDAO = new PerfilAcessoDAO();
        
        if (null != in.getId()){
            perfilAcessoDAO.removerPerfilAcesso(em, in.getId());
        }
        
        Perfil perfil = perfilDAO.cadastrarAtualizarPerfil(em, PerfilConverter.cadastrarAlterarToEntity(in));
        
        for (FuncionalidadeDTO func : in.getAcessos()){
            PerfilAcesso perfilAcesso = new PerfilAcesso();
            perfilAcesso.setFuncionalidade(FuncionalidadeConverter.dtoToEntity(func));
            perfilAcesso.setPerfil(perfil);
            perfilAcessoDAO.cadastrarPerfilAcesso(em, perfilAcesso);
        }
        
        return Boolean.TRUE;
    }

}
