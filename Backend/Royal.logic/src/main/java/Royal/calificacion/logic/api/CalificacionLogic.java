/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.calificacion.logic.api;

import Royal.calificacion.logic.dto.CalificacionDTO;
import java.util.List;

/**
 *
 * @author dc.bonilla10 y solo rojo loka.
 */
public interface CalificacionLogic {
    
   public CalificacionDTO createCalificacion (CalificacionDTO detail);

    public List<CalificacionDTO> getCalificaciones();

    public CalificacionDTO getCalificacion(String pNombre);

    public void deleteCalificacion(String pNombre);

    public void updateCalificacion(CalificacionDTO detail);
    
    
}
