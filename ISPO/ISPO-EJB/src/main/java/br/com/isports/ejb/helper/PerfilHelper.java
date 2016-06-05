/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.helper;

import br.com.apartida.entity.entities.Perfil;
import br.com.isports.bean.empresaservice.InPesquisarPelaEmpresa;
import br.com.isports.bean.exception.IspoException;
import br.com.isports.bean.perfilservice.PerfilFuncDTO;
import br.com.isports.ejb.converter.PerfilConverter;
import br.com.isports.ejb.dao.PerfilDAO;
import br.com.isports.ejb.exception.ConfigExceptionFactory;
import br.com.isports.ejb.exception.ConfigExceptions;
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

}
