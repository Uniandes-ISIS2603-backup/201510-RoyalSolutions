/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.List;
import dto.ItinerarioDTO;
import dto.ServicioDTO;

/**
 *
 * @author estudiante
 */
public interface IItinerarioLogic 
{
    public ItinerarioDTO createItinerario(ItinerarioDTO detail);

    public List<ItinerarioDTO> getItinerarios();

    public ItinerarioDTO getItinerario(String pNombre);

    public void deleteItinerario(String pNombre);

    public void updateItinerario(ItinerarioDTO detail);
    
    public ServicioDTO createServicio(ServicioDTO detailS, ItinerarioDTO detailI);
    
    public List<ServicioDTO> getServicios(ItinerarioDTO detailI);
    
    public void updateServicio(ServicioDTO detail);
    
    public void deleteServicio(String pNombre);    
}
