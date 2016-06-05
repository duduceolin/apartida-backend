package br.com.apartida.entity.entities;

import br.com.apartida.entity.converters.BooleanToStringConverter;
import br.com.apartida.entity.utils.BaseEntity;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dudu
 */
@Entity
@Table(name = "tbl_perfil")
@NamedQueries({
    @NamedQuery(name = Perfil.CONSULTAR_PERFIS, query = "SELECT p FROM Perfil p"
            + " WHERE p.empresa.id = :idEmpresa")
})
public class Perfil extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -6262765373363660496L;

    public static final String CONSULTAR_PERFIS = "Perfil.consultarPerfis";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil", unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "is_admin", nullable = false)
    private Boolean isAdmin;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "perfil", targetEntity = PerfilAcesso.class)
    private List<PerfilAcesso> acessos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<PerfilAcesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<PerfilAcesso> acessos) {
        this.acessos = acessos;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Perfil other = (Perfil) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", empresa=" + empresa + ", nome=" + nome + '}';
    }

}
