/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.service;

import Royal.ciudad.logic.api.ICiudadLogic;
import Royal.ciudad.logic.dto.CiudadDTO;
import Royal.ciudad.logic.dto.CiudadPageDTO;

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
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class CiudadService
{
   @Inject
    protected ICiudadLogic ciudadLogicService;

    @POST
    public CiudadDTO createCiudad(CiudadDTO ciudad) {
        return ciudadLogicService.createCiudad(ciudad);
    }

    @DELETE
    @Path("{id}")
    public void deleteCiudad(@PathParam("id") Long id) {
        ciudadLogicService.deleteCiudad(id);
    }

    @GET
    public CiudadPageDTO getCiudad(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return ciudadLogicService.getCiudades(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public CiudadDTO getCiudad(@PathParam("id") Long id) {
        return ciudadLogicService.getCiudad(id);
    }

    @PUT
    @Path("{id}")
    public void updateCiudad(@PathParam("id") Long id, CiudadDTO ciudad) {
        ciudadLogicService.updateCiudad(ciudad);
    }
}