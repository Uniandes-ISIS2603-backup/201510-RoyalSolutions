package Royal.evento.logic.api;

import Royal.evento.logic.dto.EventoDTO;
import Royal.evento.logic.dto.EventoPageDTO;
import java.util.List;

public interface IEventoLogic {

    public EventoDTO createEvento(EventoDTO detail);

    public List<EventoDTO> getEventos();

    public EventoPageDTO getEventos(Integer page, Integer maxRecords);

    public EventoDTO getEvento(Long id);

    public void deleteEvento(Long id);

    public void updateEvento(EventoDTO detail);
}