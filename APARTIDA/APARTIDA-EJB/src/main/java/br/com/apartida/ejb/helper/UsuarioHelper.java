package br.com.apartida.ejb.helper;

import br.com.apartida.bean.usuarioservice.InBuscarUsuario;
import br.com.apartida.bean.usuarioservice.InValidarUsuario;
import br.com.apartida.bean.usuarioservice.OutBuscarUsuario;
import br.com.apartida.bean.usuarioservice.OutValidarUsuario;
import br.com.apartida.bean.usuarioservice.UsuarioDTO;
import br.com.apartida.ejb.converter.UsuarioConverter;
import br.com.apartida.ejb.dao.UsuarioDAO;
import br.com.apartida.ejb.exception.ConfigExceptionFactory;
import br.com.apartida.ejb.exception.ConfigExceptions;
import br.com.apartida.bean.exception.IspoException;
import br.com.apartida.entity.entities.Usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author dudu
 */
public class UsuarioHelper extends AbstractHelper{

    UsuarioDAO usuarioDAO;

    public UsuarioHelper() {
        usuarioDAO = new UsuarioDAO();
    }

    public OutValidarUsuario validarUsuario(EntityManager emNoXa, InValidarUsuario inValidar) throws IspoException{
        OutValidarUsuario out = new OutValidarUsuario();

        Boolean usuarioValido = usuarioDAO.validarUsuario(emNoXa, inValidar.getDadosValidarUsuario().getLogin(), inValidar.getDadosValidarUsuario().getSenha());

        out.setUsuarioValido(usuarioValido);

        return out;
    }

    public OutBuscarUsuario buscarUsuarioLoginSenha(EntityManager emNoXa, InBuscarUsuario inBuscar) throws IspoException{

        OutBuscarUsuario out = new OutBuscarUsuario();
        UsuarioDTO dto = null;

        Usuario usuario = usuarioDAO.buscarUsuarioLoginSenha(emNoXa, inBuscar.getDadosBuscarUsuario().getLogin(), inBuscar.getDadosBuscarUsuario().getSenha());

        try{
            if (usuario != null) {
                dto = UsuarioConverter.entityToDTO(usuario);
                out.setUsuario(dto);
            }
        }catch(NullPointerException e){
            logger.error(e.getMessage());
            throw ConfigExceptionFactory.criarException(ConfigExceptions.ERRO004);
        }

        return out;
        
    }

}
