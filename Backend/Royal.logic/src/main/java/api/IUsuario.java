/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.List;
import dto.usuarioDTO;
/**
 *
 * @author estudiante
 */
public interface IUsuario 
{
    public usuarioDTO createUsuario(usuarioDTO detail);

    public List<usuarioDTO> getUsuarios();

    public usuarioDTO getUsuario(String pNombre);   
}
