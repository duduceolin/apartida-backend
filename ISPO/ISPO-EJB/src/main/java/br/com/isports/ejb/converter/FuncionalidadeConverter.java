/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.converter;

import br.com.isports.bean.funcionalidadeservice.FuncionalidadeDTO;
import br.com.isports.entity.entities.Funcionalidade;

/**
 *
 * @author dudu
 */
public abstract class FuncionalidadeConverter extends AbstractConverter {

    public static FuncionalidadeDTO entityToDTO(Funcionalidade entity) {
        FuncionalidadeDTO dto = new FuncionalidadeDTO();

        dto.setIdFuncionalidade(entity.getId());
        dto.setIdMenuPai(dto.getIdMenuPai());
        dto.setNome(entity.getNome());
        dto.setUrl(entity.getUrl());

        return dto;
    }

    public static Funcionalidade dtoToEntity(FuncionalidadeDTO dto) {
        Funcionalidade entity = new Funcionalidade();

        if (dto.getIdFuncionalidade() != null) {
            entity.setId(dto.getIdFuncionalidade());
        }

        entity.setMenuPai(dto.getIdMenuPai());
        entity.setNome(dto.getNome());
        entity.setUrl(dto.getUrl());

        return entity;
    }

}
