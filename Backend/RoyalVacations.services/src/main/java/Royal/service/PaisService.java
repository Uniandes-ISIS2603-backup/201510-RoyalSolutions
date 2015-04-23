/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.service;

import Royal.pais.logic.api.IPaisLogic;
import Royal.pais.logic.dto.PaisDTO;
import Royal.pais.logic.dto.PaisPageDTO;
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

@Path("/pais")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class PaisService 
{
    @Inject
    protected IPaisLogic countryLogic;

    @POST
    public PaisDTO createCountry(PaisDTO sport) {
        return countryLogic.createCountry(sport);
    }

    @DELETE
    @Path("{id}")
    public void deleteCountry(@PathParam("id") Long id) {
        countryLogic.deleteCountry(id);
    }

    @GET
    public PaisPageDTO getCountries(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return countryLogic.getCountries(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public PaisDTO getCountry(@PathParam("id") Long id) {
        return countryLogic.getCountry(id);
    }

    @PUT
    @Path("{id}")
    public void updateCountry(@PathParam("id") Long id, PaisDTO sport) {
        countryLogic.updateCountry(sport);
    }

    @GET
    @Path("mostPopulated")
    public PaisDTO getMostPopulated() {
        return countryLogic.getMostPopulated();
    }

    @GET
    @Path("leastPopulated")
    public PaisDTO getLeastPopulated() {
        return countryLogic.getLeastPopulated();
    }
}