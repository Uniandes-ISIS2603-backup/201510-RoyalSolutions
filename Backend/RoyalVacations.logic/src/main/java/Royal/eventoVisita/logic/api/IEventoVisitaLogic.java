/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.eventoVisita.logic.api;

import Royal.eventoVisita.logic.dto.EventoVisitaDTO;
import Royal.eventoVisita.logic.dto.EventoVisitaPageDTO;
import java.util.List;

/**
 *
 * @author estudiante
 */
public interface IEventoVisitaLogic 
{
    public EventoVisitaDTO createEventoVisita(EventoVisitaDTO detail);

    public List<EventoVisitaDTO> getEventoVisitas();

    public EventoVisitaPageDTO getEventoVisitas(Integer page, Integer maxRecords);

    public EventoVisitaDTO getEventoVisita(Long id);

    public void deleteEventoVisita(Long id);

    public void updateEventoVisita(EventoVisitaDTO detail);
}
