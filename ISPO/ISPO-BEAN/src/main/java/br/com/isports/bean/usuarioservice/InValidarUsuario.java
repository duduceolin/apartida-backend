package br.com.isports.bean.usuarioservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dudu
 */
@XmlRootElement(name = "InValidarUsuario")
@XmlAccessorType(XmlAccessType.FIELD)
public class InValidarUsuario implements Serializable {

    private static final long serialVersionUID = -5660662245439342343L;

    @XmlElement(required = true)
    private BuscarUsuarioDTO dados;

    public BuscarUsuarioDTO getDados() {
        return dados;
    }

    public void setDados(BuscarUsuarioDTO dados) {
        this.dados = dados;
    }

}
