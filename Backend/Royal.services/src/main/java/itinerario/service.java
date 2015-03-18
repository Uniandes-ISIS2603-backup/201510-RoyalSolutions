/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itinerario;

import api.IItinerarioLogic;
import dto.itinerarioDTO;
import dto.servicioDTO;
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

@Path("/itinerary")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class service
{
   @Inject
    protected IItinerarioLogic LogicService;

    @POST
    public itinerarioDTO createItinerario(itinerarioDTO itinerario) {
        return LogicService.createItinerario(itinerario);
    }

    @DELETE
    @Path("{nombre}")
    public void deleteItinerario(@PathParam("nombre") String nombre) {
        LogicService.deleteItinerario(nombre);
    }


    @GET
    @Path("{nombre}")
    public itinerarioDTO getItineario(@PathParam("nombre") String nombre) {
        return LogicService.getItinerario(nombre);
    }

    @PUT
    public void updateItinerario(@PathParam("nombre") String nombre, itinerarioDTO itinerario) {
        LogicService.updateItinerario(itinerario);
    }
    
    @POST
    public servicioDTO createServicio(servicioDTO servicio, itinerarioDTO itinerario) {
        return LogicService.createServicio(servicio, itinerario);
    }
    
     @GET
    @Path("{nombre}")
    public List<servicioDTO> getServicios(itinerarioDTO itinerario) {
        return LogicService.getServicios(itinerario);
    }
    
     @PUT
    public void updateServicio(@PathParam("nombre") String nombre, servicioDTO servicio) {
        LogicService.updateServicio(servicio);
    }
    
    @DELETE
    @Path("{nombre}")
    public void deleteServicio(@PathParam("nombre") String nombre) {
        LogicService.deleteServicio(nombre);
    }
}