/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.helper;

import br.com.isports.bean.perfilservice.OutPesquisarPerfis;
import br.com.isports.bean.perfilservice.PerfilDTO;
import br.com.isports.ejb.converter.PerfilConverter;
import br.com.isports.ejb.dao.EmpresaDAO;
import br.com.apartida.entity.entities.Empresa;
import br.com.apartida.entity.entities.Perfil;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author dudu
 */
public class PerfilHelper extends AbstractHelper {

    public OutPesquisarPerfis pesquisarPerfis(EntityManager emNoXa, Long idEmpresa) {
        OutPesquisarPerfis out = new OutPesquisarPerfis();
        out.setPerfil(new ArrayList<PerfilDTO>());

        Empresa empresa = new EmpresaDAO().buscarEmpresa(emNoXa, idEmpresa);

        for (Perfil perfil : empresa.getPerfisEmpresa()) {
            out.getPerfil().add(PerfilConverter.entityToDTO(perfil));
        }

        return out;
    }

}
