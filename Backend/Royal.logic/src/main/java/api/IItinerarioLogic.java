/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.List;
import dto.itinerarioDTO;
import dto.servicioDTO;

/**
 *
 * @author estudiante
 */
public interface IItinerarioLogic 
{
    public itinerarioDTO createItinerario(itinerarioDTO detail);

    public List<itinerarioDTO> getItinerarios();

    public itinerarioDTO getItinerario(String pNombre);

    public void deleteItinerario(String pNombre);

    public void updateItinerario(itinerarioDTO detail);
    
    public servicioDTO createServicio(servicioDTO detailS, itinerarioDTO detailI);
    
    public List<servicioDTO> getServicios(itinerarioDTO detailI);
    
    public void updateServicio(servicioDTO detail);
    
    public void deleteServicio(String pNombre);    
}
