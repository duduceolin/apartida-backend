/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.iface.ejb;

/**
 *
 * @author dudu
 */
public interface UsuarioServiceLocal {

    public Integer buscarTotalUsuario();

    public void cadastrarUsuario();
}
