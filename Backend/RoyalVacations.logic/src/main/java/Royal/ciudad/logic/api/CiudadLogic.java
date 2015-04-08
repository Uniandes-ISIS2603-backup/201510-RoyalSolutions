/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.ciudad.logic.api;

import java.util.List;
import Royal.ciudad.logic.dto.CiudadDTO;

/**
 *
 * @author estudiante
 */
public interface CiudadLogic 
{
    public CiudadDTO createCiudad(CiudadDTO detail);

    public List<CiudadDTO> getCiudades();

    public CiudadDTO getCiudad(String pNombre);

    public void deleteCiudad(String pNombre);

    public void updateCiudad(CiudadDTO detail);
}
