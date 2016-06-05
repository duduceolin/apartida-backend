/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.bean.empresaservice;

import br.com.apartida.bean.planoservice.PlanoDTO;
import java.io.Serializable;

/**
 *
 * @author dudu
 */
public class EmpresaDTO implements Serializable {

    private static final long serialVersionUID = -8698098992806701663L;

    private Long id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private PlanoDTO plano;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public PlanoDTO getPlano() {
        return plano;
    }

    public void setPlano(PlanoDTO plano) {
        this.plano = plano;
    }

}
