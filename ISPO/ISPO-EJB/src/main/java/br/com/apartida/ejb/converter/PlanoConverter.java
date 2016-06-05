/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.converter;

import br.com.isports.bean.funcionalidadeservice.FuncionalidadeDTO;
import br.com.isports.bean.planoservice.PlanoDTO;
import br.com.apartida.entity.entities.Plano;
import br.com.apartida.entity.entities.PlanoAcesso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dudu
 */
public abstract class PlanoConverter extends AbstractConverter {

    public static PlanoDTO entityToDTO(Plano entity) {
        final PlanoDTO dto = new PlanoDTO();

        List<FuncionalidadeDTO> funcionalidades = new ArrayList<>();

        for (PlanoAcesso acesso : entity.getAcessos()) {
            funcionalidades.add(FuncionalidadeConverter.entityToDTO(acesso.getFuncionalidade()));
        }

        if (!funcionalidades.isEmpty()) {
            dto.setFuncionalidades(funcionalidades);
        }

        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        return dto;
    }

    /**
     * Método não finalizado (implementação).
     * @param dto
     * @return 
     */
    public static Plano dtoToEntity(PlanoDTO dto) {
        Plano entity = new Plano();

        if (dto.getId() != null) {
            entity.setId(dto.getId());
        }

        entity.setNome(dto.getNome());

        return entity;
    }

}
