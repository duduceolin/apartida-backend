/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.service;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author dudu
 */
@Path("UsuarioService")
public class UsuarioService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public UsuarioService() {
    }

    @GET
    @Path("buscar/{usuarioId}")
    @Produces("application/json")
    public String getUsuario(@PathParam("usuarioId") String usuarioId) {
        Gson gson = new Gson();

        if (usuarioId.equals("A")) {

            return gson.toJson("certo");
        } else {

            return gson.toJson("errado");
        }
    }
}
