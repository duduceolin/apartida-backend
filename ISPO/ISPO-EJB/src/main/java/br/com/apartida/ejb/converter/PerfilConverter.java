/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.converter;

import br.com.apartida.entity.entities.Funcionalidade;
import br.com.isports.bean.funcionalidadeservice.FuncionalidadeDTO;
import br.com.isports.bean.perfilservice.PerfilDTO;
import br.com.apartida.entity.entities.Perfil;
import br.com.apartida.entity.entities.PerfilAcesso;
import br.com.isports.bean.perfilservice.FuncionalidadePerfilDTO;
import br.com.isports.bean.perfilservice.PerfilFuncDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dudu
 */
public abstract class PerfilConverter extends AbstractConverter {
    
    public static Perfil dtoToEntity(PerfilDTO dto) throws NullPointerException {
        Perfil entity = new Perfil();
        
        if (dto.getId() != null) {
            entity.setId(dto.getId());
        }
        
        entity.setNome(dto.getNome());
        entity.setIsAdmin(dto.getIsAdmin());
        
        if (dto.getEmpresa() != null) {
            entity.setEmpresa(EmpresaConverter.dtoToEntity(dto.getEmpresa()));
        }
        
        return entity;
    }
    
    public static PerfilDTO entityToDTO(Perfil entity) throws NullPointerException {
        PerfilDTO dto = new PerfilDTO();
        
        dto.setId(entity.getId());
        
        List<FuncionalidadeDTO> funcionalidades = new ArrayList<>();
        
        for (PerfilAcesso acesso : entity.getAcessos()) {
            funcionalidades.add(FuncionalidadeConverter.entityToDTO(acesso.getFuncionalidade()));
        }
        
        if (!funcionalidades.isEmpty()) {
            dto.setFuncionalidades(funcionalidades);
        }
        
        dto.setEmpresa(EmpresaConverter.entityToDTO(entity.getEmpresa()));
        dto.setNome(entity.getNome());
        dto.setIsAdmin(entity.getIsAdmin());
        
        return dto;
    }
    
    private static List<FuncionalidadePerfilDTO> converterListaFuncionalidades(List<PerfilAcesso> lista) throws NullPointerException{
        List<FuncionalidadePerfilDTO> listaRetorno = new ArrayList<>();
        
        for (PerfilAcesso perfilAcesso : lista){
            if (null != perfilAcesso.getFuncionalidade() && null != perfilAcesso.getFuncionalidade().getMenuPai()){
                Funcionalidade func = perfilAcesso.getFuncionalidade();
                FuncionalidadePerfilDTO funcionalidade = new FuncionalidadePerfilDTO();
                funcionalidade.setIcone(func.getIcone());
                funcionalidade.setIdFuncionalidade(func.getId());
                funcionalidade.setNome(func.getNome());
                funcionalidade.setUrl(func.getUrl());
                listaRetorno.add(funcionalidade);
            }
        }
        
        return listaRetorno;

    }
    
    public static List<PerfilFuncDTO> entityToPerfilFuncDTO(List<Perfil> perfis) throws NullPointerException {
        List<PerfilFuncDTO> retorno = new ArrayList<>();
        
        for (Perfil perfil : perfis){
            PerfilFuncDTO perf = new PerfilFuncDTO();
            perf.setFuncionalidades(converterListaFuncionalidades(perfil.getAcessos()));
            perf.setId(perfil.getId());
            perf.setAdmin(perfil.getIsAdmin());
            perf.setNome(perfil.getNome());
            retorno.add(perf);
        }
        
        return retorno;
        
    }
    
}
