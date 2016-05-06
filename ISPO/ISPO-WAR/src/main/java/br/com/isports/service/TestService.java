/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.isports.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author dudu
 */
@Path("")
public class TestService {

    @GET
    @Path("/helloworld")
    public Response getHelloWorld() {
        String value = "TT World";
        return Response.status(200).entity(value).build();
    }

}
