/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.service;

import Royal.ciudad.logic.api.ICiudadLogic;
import Royal.ciudad.logic.dto.CiudadDTO;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author estudiante
 */

@Path("/ciudad")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class CiudadService
{
   @Inject
    protected ICiudadLogic LogicService;

    @POST
    public CiudadDTO createCiudad(CiudadDTO ciudad) {
        return LogicService.createCiudad(ciudad);
    }

    @DELETE
    @Path("{nombre}")
    public void deleteCiudad(@PathParam("nombre") String nombre) {
        LogicService.deleteCiudad(nombre);
    }


    @GET
    @Path("{nombre}")
    public CiudadDTO getCiudad(@PathParam("nombre") String nombre) {
        return LogicService.getCiudad(nombre);
    }

    @PUT
    public void updateCiudad(@PathParam("nombre") String nombre, @PathParam("pais") String pais, CiudadDTO ciudad) {
        LogicService.updateCiudad(ciudad);
    }
}