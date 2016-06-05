/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.exception;

import br.com.isports.bean.exception.TipoErro;

/**
 *
 * @author dudu
 */
public enum ConfigExceptions {

    ERRO001("Registro não encontrado"),
    ERRO002("Ocorreu um erro inesperado.", TipoErro.DESCONHECIDO),
    ERRO003("Nenhum dado encontrado"),
    ERRO004("Erro na conversão de valores.", TipoErro.VALIDACAO),;

    private final String descricao;

    private final TipoErro tipoErro;

    private ConfigExceptions(final String descricao) {
        this(descricao, TipoErro.NEGOCIO);
    }

    private ConfigExceptions(final String descricao, final TipoErro tipoErro) {
        this.descricao = descricao;
        this.tipoErro = tipoErro;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoErro getTipoErro() {
        return tipoErro;
    }

}
