/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import Royal.usuario.logic.api.IUsuario;
import Royal.usuario.logic.dto.UsuarioDTO;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author estudiante
 */

@Path("/usuario")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class service
{
   @Inject
    protected IUsuario LogicService;

    @POST
    public UsuarioDTO createUsuario(UsuarioDTO usuario) {
        return LogicService.createUsuario(usuario);
    }

    @GET
    @Path("{nombre}")
    public UsuarioDTO getItineario(@PathParam("nombre") String nombre) {
        return LogicService.getUsuario(nombre);
    }
}