/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.service;

import Royal.visita.logic.api.IVisitaLogic;
import Royal.visita.logic.dto.VisitaDTO;
import Royal.visita.logic.dto.VisitaPageDTO;
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

@Path("/visita")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VisitaService 
{
    @Inject
    protected IVisitaLogic visitaLogicService;

    @POST
    public VisitaDTO createVisita(VisitaDTO visita) {
        return visitaLogicService.createVisita(visita);
    }

    @DELETE
    @Path("{id}")
    public void deleteVisita(@PathParam("id") Long id) {
        visitaLogicService.deleteVisita(id);
    }

    @GET
    public VisitaPageDTO getVisita(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return visitaLogicService.getVisitas(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public VisitaDTO getVisita(@PathParam("id") Long id) {
        return visitaLogicService.getVisita(id);
    }

    @PUT
    @Path("{id}")
    public void updateVisita(@PathParam("id") Long id, VisitaDTO visita) {
        visitaLogicService.updateVisita(visita);
    }
}
