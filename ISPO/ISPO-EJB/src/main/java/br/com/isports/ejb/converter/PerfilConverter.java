/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.converter;

import br.com.isports.bean.funcionalidadeservice.FuncionalidadeDTO;
import br.com.isports.bean.perfilservice.PerfilDTO;
import br.com.isports.entity.entities.Perfil;
import br.com.isports.entity.entities.PerfilAcesso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dudu
 */
public abstract class PerfilConverter extends AbstractConverter {

    public static Perfil dtoToEntity(PerfilDTO dto) throws NullPointerException{
        Perfil entity = new Perfil();

        if (dto.getId() != null) {
            entity.setId(dto.getId());
        }

        entity.setNome(dto.getNome());

        if (dto.getEmpresa() != null) {
            entity.setEmpresa(EmpresaConverter.dtoToEntity(dto.getEmpresa()));
        }

        return entity;
    }

    public static PerfilDTO entityToDTO(Perfil entity) throws NullPointerException{
        PerfilDTO dto = new PerfilDTO();

        dto.setId(entity.getId());
        
        List<FuncionalidadeDTO> funcionalidades = new ArrayList<>();

        for (PerfilAcesso acesso : entity.getAcessos()) {
            funcionalidades.add(FuncionalidadeConverter.entityToDTO(acesso.getFuncionalidade()));
        }
        
        if (!funcionalidades.isEmpty()){
            dto.setFuncionalidades(funcionalidades);
        }
        
        dto.setEmpresa(EmpresaConverter.entityToDTO(entity.getEmpresa()));
        dto.setNome(entity.getNome());

        return dto;
    }

}
