/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.service;

import Royal.evento.logic.api.IEventoLogic;
import Royal.evento.logic.dto.EventoDTO;
import Royal.evento.logic.dto.EventoPageDTO;
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

@Path("/evento")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class EventoService 
{
    @Inject
    protected IEventoLogic EventoLogicService;

    @POST
    public EventoDTO createEvento(EventoDTO Evento) {
        return EventoLogicService.createEvento(Evento);
    }

    @DELETE
    @Path("{id}")
    public void deleteEvento(@PathParam("id") Long id) {
        EventoLogicService.deleteEvento(id);
    }

    @GET
    public EventoPageDTO getEvento(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return EventoLogicService.getEventos(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public EventoDTO getEvento(@PathParam("id") Long id) {
        return EventoLogicService.getEvento(id);
    }

    @PUT
    @Path("{id}")
    public void updateEvento(@PathParam("id") Long id, EventoDTO Evento) {
        EventoLogicService.updateEvento(Evento);
    }    
}
