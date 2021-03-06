/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apartida.entity.entities;

import br.com.apartida.entity.utils.BaseEntity;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author dudu
 */
@Entity
@Table(name = "tbl_plano_acesso")
@NamedQueries({
    @NamedQuery(name = PlanoAcesso.PESQUISAR_FUNCIONALIDADES_PAI, query = "SELECT new br.com.apartida.entity.dtos.FuncionalidadeMenuDTO"
            + "(pa.funcionalidade.id, pa.funcionalidade.nome, pa.funcionalidade.url, pa.funcionalidade.icone)"
            + " FROM PlanoAcesso pa"
            + " WHERE pa.plano.id = :idPlano AND pa.funcionalidade.menuPai is null"),

    @NamedQuery(name = PlanoAcesso.PESQUISAR_SUBFUNCIONALIDADES, query = "SELECT new br.com.apartida.entity.dtos.FuncionalidadeMenuDTO(f.id, f.nome, f.url, f.icone)"
            + " FROM Funcionalidade f WHERE f.menuPai = :idFuncionalidadePai"
    )
})
public class PlanoAcesso extends BaseEntity implements Serializable {

    public static final String PESQUISAR_FUNCIONALIDADES_PAI = "PlanoAcesso.pesquisarFuncionalidadesPai";

    public static final String PESQUISAR_SUBFUNCIONALIDADES = "PlanoAcesso.pesquisarSubFuncionalidades";

    private static final long serialVersionUID = 5888091697452093919L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano_acesso", nullable = false, unique = true)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Plano.class)
    @JoinColumn(name = "id_plano", nullable = false)
    private Plano plano;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Funcionalidade.class)
    @JoinColumn(name = "id_funcionalidade", nullable = false)
    private Funcionalidade funcionalidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Funcionalidade getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(Funcionalidade funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final PlanoAcesso other = (PlanoAcesso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlanoAcesso{" + "id=" + id + ", plano=" + plano + '}';
    }

}
