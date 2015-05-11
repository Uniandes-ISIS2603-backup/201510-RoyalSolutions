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
    public EventoVisitaDTO createEvento(EventoVisitaDTO detail);

    public List<EventoVisitaDTO> getEventos();

    public EventoVisitaPageDTO getEventos(Integer page, Integer maxRecords);

    public EventoVisitaDTO getEvento(Long id);

    public void deleteEvento(Long id);

    public void updateEvento(EventoVisitaDTO detail);
}
