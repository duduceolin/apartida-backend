package br.com.apartida.entity.entities;

import br.com.apartida.entity.utils.BaseEntity;
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
@Table(name = "tbl_funcionalidade")
public class Funcionalidade extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -5474460865295920593L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionalidade", unique = true, nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "url")
    private String url;

    @Column(name = "icone")
    private String icone;

    @Column(name = "menu_pai")
    private Long menuPai;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionalidade", targetEntity = PerfilAcesso.class)
    private List<PerfilAcesso> acessos;

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

    public List<PerfilAcesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<PerfilAcesso> acessos) {
        this.acessos = acessos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getMenuPai() {
        return menuPai;
    }

    public void setMenuPai(Long menuPai) {
        this.menuPai = menuPai;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Funcionalidade other = (Funcionalidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionalidade{" + "id=" + id + ", nome=" + nome + '}';
    }

}
