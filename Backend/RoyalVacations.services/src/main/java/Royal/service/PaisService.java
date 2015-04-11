/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.service;

import Royal.ciudad.logic.api.ICiudadLogic;
import Royal.pais.logic.api.IPaisLogic;
import Royal.pais.logic.dto.PaisDTO;
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
import javax.ws.rs.core.MediaType;

/**
 *
 * @author estudiante
 */

@Path("/pais")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class PaisService 
{
     @Inject
    protected IPaisLogic LogicService;

    @POST
    public PaisDTO createPais(PaisDTO pais)
    {
        return LogicService.createPais(pais);
    }

    @DELETE
    @Path("{id}")
    public void deletePais(@PathParam("id") Long id) {
        LogicService.deletePais(id);
    }


    @GET
    @Path("{id}")
    public PaisDTO getPais(@PathParam("id") Long id) {
        return LogicService.getPais(id);
    }

    @PUT
    public void updatePais(@PathParam("nombre") String nombre, @PathParam("pais") int poblacion, PaisDTO pais) {
        LogicService.updatePais(pais);
    }    
}