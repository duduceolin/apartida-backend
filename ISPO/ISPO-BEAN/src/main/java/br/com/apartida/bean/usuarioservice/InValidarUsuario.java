package br.com.isports.bean.usuarioservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author dudu
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class InValidarUsuario implements Serializable {

    private static final long serialVersionUID = -5660662245439342343L;

    @XmlElement(required = true)
    private ValidarUsuarioDTO dadosValidarUsuario;

    public ValidarUsuarioDTO getDadosValidarUsuario() {
        return dadosValidarUsuario;
    }

    public void setDadosValidarUsuario(ValidarUsuarioDTO dadosValidarUsuario) {
        this.dadosValidarUsuario = dadosValidarUsuario;
    }

}
