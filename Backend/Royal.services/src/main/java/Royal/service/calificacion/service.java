/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion;

import Royal.calificacion.logic.api.CalificacionLogic;
import Royal.calificacion.logic.dto.CalificacionDTO;
import java.util.Date;
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

@Path("/Calificacion")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class service
{
   @Inject
    protected CalificacionLogic LogicService;

    @POST
    public CalificacionDTO createCalificacion(CalificacionDTO calificacion) {
        return LogicService.createCalificacion(calificacion);
    }

    @DELETE
    @Path("{nombre}")
    public void deleteCalificacion(@PathParam("nombre") String nombre) {
        LogicService.deleteCalificacion(nombre);
    }


    @GET
    @Path("{nombre}")
    public CalificacionDTO getItineario(@PathParam("nombre") String nombre) {
        return LogicService.getCalificacion(nombre);
    }

    @PUT
    public void updateItinerario(@PathParam("nombre") String nombre, @PathParam("tipo") String tipo, @PathParam("fecha") Date fecha, @PathParam("valor") double valor, CalificacionDTO Calificacion) {
        LogicService.updateCalificacion(Calificacion);
    }
}
