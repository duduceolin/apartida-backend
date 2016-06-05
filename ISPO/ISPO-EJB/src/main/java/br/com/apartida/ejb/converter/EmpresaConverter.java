/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.ejb.converter;

import br.com.apartida.bean.empresaservice.EmpresaDTO;
import br.com.apartida.entity.entities.Empresa;

/**
 *
 * @author dudu
 */
public abstract class EmpresaConverter extends AbstractConverter {
    
    public static Empresa dtoToEntity(EmpresaDTO dto) throws NullPointerException {
        Empresa entity = new Empresa();
        
        if (dto.getId() != null) {
            entity.setId(dto.getId());
        }
        
        entity.setCep(dto.getCep());
        entity.setCidade(dto.getCidade());
        entity.setCnpj(dto.getCnpj());
        entity.setEstado(dto.getEstado());
        entity.setNome(dto.getNome());
        entity.setTelefone(dto.getTelefone());
        entity.setPlano(PlanoConverter.dtoToEntity(dto.getPlano()));
        entity.setPais(dto.getPais());
        
        return entity;
    }
    
    public static EmpresaDTO entityToDTO(Empresa entity) throws NullPointerException {
        EmpresaDTO dto = new EmpresaDTO();
        
        dto.setId(entity.getId());
        dto.setCep(entity.getCep());
        dto.setCidade(entity.getCidade());
        dto.setCnpj(entity.getCnpj());
        dto.setEstado(entity.getEstado());
        dto.setNome(entity.getNome());
        dto.setTelefone(entity.getTelefone());
        dto.setPais(entity.getPais());
        dto.setPlano(PlanoConverter.entityToDTO(entity.getPlano()));
        
        return dto;
    }
}
