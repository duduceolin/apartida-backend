/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.dao;

import br.com.isports.entity.entities.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author dudu
 */
public class UsuarioDAO extends GenericDAO<Usuario, Long> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    public List<Usuario> listarUsuarios(EntityManager emNoXa) {
        this.emNoXa = emNoXa;
        return getList();
    }

    public void cadastrarUsuario(EntityManager em, Usuario usuario) {
        this.em = em;
        salvar(usuario);
    }

    public Boolean validarUsuario(EntityManager emNoXa, String login, String senha) {

        TypedQuery<Usuario> query = emNoXa.createNamedQuery(Usuario.VALIDAR_USUARIO, Usuario.class);
        query.setParameter("login", login);
        query.setParameter("senha", senha);

        List<Usuario> results = query.getResultList();

        if (results != null && !results.isEmpty()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Usuario buscarUsuarioLoginSenha(EntityManager emNoXa, String login, String senha) {
        TypedQuery<Usuario> query = emNoXa.createNamedQuery(Usuario.VALIDAR_USUARIO, Usuario.class);

        query.setParameter("login", login);
        query.setParameter("senha", senha);

        return query.getSingleResult();
    }
}
