/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.service;

import Royal.login.logic.api.ILoginLogic;
import Royal.login.logic.dto.LoginDTO;
import Royal.login.logic.dto.LoginPageDTO;
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

@Path("/login")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class LoginService 
{
     @Inject
    protected ILoginLogic loginLogicService;

    @POST
    public LoginDTO createLogin(LoginDTO login) {
        return loginLogicService.createLogin(login);
    }

    @DELETE
    @Path("{id}")
    public void deleteLogin(@PathParam("id") Long id) {
        loginLogicService.deleteLogin(id);
    }

    @GET
    public LoginPageDTO getLogin(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return loginLogicService.getLogines(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public LoginDTO getLogin(@PathParam("id") Long id) {
        return loginLogicService.getLogin(id);
    }

    @PUT
    @Path("{id}")
    public void updateLogin(@PathParam("id") Long id, LoginDTO login) {
        loginLogicService.updateLogin(login);
    }
}
