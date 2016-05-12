/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.converter;

import br.com.isports.bean.perfilservice.PerfilDTO;
import br.com.isports.entity.entities.Perfil;

/**
 *
 * @author dudu
 */
public abstract class PerfilConverter extends AbstractConverter {

    public static Perfil dtoToEntity(PerfilDTO dto) {
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

    public static PerfilDTO entityToDTO(Perfil entity) {
        PerfilDTO dto = new PerfilDTO();

        dto.setId(entity.getId());
        dto.setEmpresa(EmpresaConverter.entityToDTO(entity.getEmpresa()));
        dto.setNome(entity.getNome());

        return dto;
    }

}
