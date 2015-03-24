/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.List;
import dto.ciudadDTO;

/**
 *
 * @author estudiante
 */
public interface CiudadLogic 
{
    public ciudadDTO createCiudad(ciudadDTO detail);

    public List<ciudadDTO> getCiudades();

    public ciudadDTO getCiudad(String pNombre);

    public void deleteCiudad(String pNombre);

    public void updateCiudad(ciudadDTO detail);
}
