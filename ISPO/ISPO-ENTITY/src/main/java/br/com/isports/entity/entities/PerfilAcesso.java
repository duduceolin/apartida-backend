package br.com.isports.entity.entities;

import br.com.isports.entity.utils.BaseEntity;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dudu
 */
@Entity
@Table(name = "tbl_perfil_acesso")
public class PerfilAcesso extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -6459110208424044486L;

    @Id
    @Column(name = "id_perfil_acesso", nullable = false, unique = true)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Perfil.class)
    @JoinColumn(name = "id_perfil", nullable = false)
    private Perfil perfil;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Funcionalidade.class)
    @JoinColumn(name = "id_funcionalidade", nullable = false)
    private Funcionalidade funcionalidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Funcionalidade getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(Funcionalidade funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final PerfilAcesso other = (PerfilAcesso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PerfilAcesso{" + "id=" + id + ", perfil=" + perfil + ", funcionalidade=" + funcionalidade + '}';
    }

}
