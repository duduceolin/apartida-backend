/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.bean.perfilservice;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author dudu
 */
public class OutPesquisarPerfis implements Serializable {

    private static final long serialVersionUID = -7007607915769152655L;

    private List<PerfilFuncDTO> perfis;

    public List<PerfilFuncDTO> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<PerfilFuncDTO> perfis) {
        this.perfis = perfis;
    }

}
