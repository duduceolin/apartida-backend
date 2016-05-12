/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.ejb.dao;

import br.com.isports.entity.entities.Usuario;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author dudu
 */
public class UsuarioDAO extends GenericDAO<Usuario, Integer> {

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
}
