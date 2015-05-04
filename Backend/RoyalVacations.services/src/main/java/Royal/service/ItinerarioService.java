/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.service;

import Royal.itinerario.logic.api.IItinerarioLogic;
import Royal.itinerario.logic.dto.ItinerarioDTO;
import Royal.itinerario.logic.dto.ItinerarioPageDTO;
import java.util.List;
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

@Path("/itinerario")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class ItinerarioService 
{
    @Inject
    protected IItinerarioLogic itinerarioLogicService;

    @POST
    public ItinerarioDTO createItinerario(ItinerarioDTO itinerario) {
        return itinerarioLogicService.createItinerario(itinerario);
    }

    @DELETE
    @Path("{id}")
    public void deleteItinerario(@PathParam("id") Long id) {
        itinerarioLogicService.deleteItinerario(id);
    }

    @GET
    @Path("{id}")
    public ItinerarioDTO getItinerario(@PathParam("id") Long id) {
        return itinerarioLogicService.getItinerario(id);
    }
    
    @GET
    public ItinerarioPageDTO getItinerarios(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return itinerarioLogicService.getItinerarios(page, maxRecords);
    }

    @PUT
    @Path("{id}")
    public void updateItinerario(@PathParam("id") Long id, ItinerarioDTO itinerario) {
        itinerarioLogicService.updateItinerario(itinerario);
    }
    
}
