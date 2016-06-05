/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.converter;

import br.com.apartida.entity.dtos.FuncionalidadeMenuDTO;
import br.com.apartida.bean.funcionalidadeservice.FuncionalidadeDTO;
import br.com.apartida.entity.entities.Funcionalidade;
import br.com.apartida.bean.funcionalidadeservice.FuncionalidadeToMenuDTO;
import java.util.ArrayList;

/**
 *
 * @author dudu
 */
public abstract class FuncionalidadeConverter extends AbstractConverter {
    
    public static FuncionalidadeDTO entityToDTO(Funcionalidade entity) {
        FuncionalidadeDTO dto = new FuncionalidadeDTO();
        
        dto.setIdFuncionalidade(entity.getId());
        if (null != entity.getMenuPai()) {
            dto.setIdMenuPai(entity.getMenuPai());
        }
        dto.setIcone(entity.getIcone());
        dto.setNome(entity.getNome());
        
        return dto;
    }
    
    public static Funcionalidade dtoToEntity(FuncionalidadeDTO dto) {
        Funcionalidade entity = new Funcionalidade();
        
        if (dto.getIdFuncionalidade() != null) {
            entity.setId(dto.getIdFuncionalidade());
        }
        
        return entity;
    }
    
    public static FuncionalidadeToMenuDTO converterMenuToDTO(FuncionalidadeMenuDTO menu) {
        FuncionalidadeToMenuDTO dto = new FuncionalidadeToMenuDTO();
        
        dto.setIdFuncionalidade(menu.getIdFuncionalidade());
        dto.setNome(menu.getNome());
        dto.setUrl(menu.getUrl());
        dto.setIcone(menu.getIcone());
        
        if (menu.getSubFuncionalidades() != null) {
            
            dto.setSubFuncionalidades(new ArrayList<FuncionalidadeToMenuDTO>());
            
            for (FuncionalidadeMenuDTO func : menu.getSubFuncionalidades()) {
                dto.getSubFuncionalidades().add(converterMenuToDTO(func));
            }
        }
        return dto;
    }
    
}
