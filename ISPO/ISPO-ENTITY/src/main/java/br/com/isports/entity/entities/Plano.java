/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.entity.entities;

import br.com.isports.entity.utils.BaseEntity;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dudu
 */
@Entity
@Table(name = "tbl_plano")
public class Plano extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1520336556592005932L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "preco", nullable = false)
    private Double preco;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "plano", targetEntity = PlanoAcesso.class)
    private List<PlanoAcesso> acessos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa", targetEntity = Empresa.class)
    private List<Perfil> empresas;

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

    public List<PlanoAcesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<PlanoAcesso> acessos) {
        this.acessos = acessos;
    }

    public List<Perfil> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Perfil> empresas) {
        this.empresas = empresas;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plano other = (Plano) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Plano{" + "id=" + id + ", nome=" + nome + '}';
    }

}
