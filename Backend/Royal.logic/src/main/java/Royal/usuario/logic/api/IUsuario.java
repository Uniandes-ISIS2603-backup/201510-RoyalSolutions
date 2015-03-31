/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.usuario.logic.api;

import java.util.List;
import Royal.usuario.logic.dto.UsuarioDTO;
/**
 *
 * @author estudiante
 */
public interface IUsuario 
{
    public UsuarioDTO createUsuario(UsuarioDTO detail);

    public List<UsuarioDTO> getUsuarios();

    public UsuarioDTO getUsuario(String pNombre);   
}
