/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.eventoVisita.logic.ejb;

import Royal.ciudad.logic.entity.CiudadEntity;
import Royal.evento.logic.api.IEventoLogic;
import Royal.evento.logic.converter.EventoConverter;
import Royal.evento.logic.dto.EventoDTO;
import Royal.evento.logic.dto.EventoPageDTO;
import Royal.evento.logic.entity.EventoEntity;
import Royal.eventoVisita.logic.api.IEventoVisitaLogic;
import Royal.eventoVisita.logic.converter.EventoVisitaConverter;
import Royal.eventoVisita.logic.dto.EventoVisitaDTO;
import Royal.eventoVisita.logic.dto.EventoVisitaPageDTO;
import Royal.eventoVisita.logic.entity.EventoVisitaEntity;
import static Royal.eventoVisita.logic.entity.EventoVisitaEntity_.evento;
import Royal.visita.logic.entity.VisitaEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author estudiante
 */

@Default
@Stateless
@LocalBean
public class EventoVisitaLogic implements IEventoVisitaLogic
{
    @PersistenceContext(unitName = "RoyalPU")
    protected EntityManager entityManager;

    public EventoVisitaDTO createEventoVisita(EventoVisitaDTO EventoVisita) {
        EventoVisitaEntity entity = EventoVisitaConverter.persistenceDTO2Entity(EventoVisita);
        EventoEntity evento = this.getSelectedEvento(EventoVisita);
        if (evento != null) {
            entity.setEvento(evento);
        }
        VisitaEntity visita = this.getSelectedVisita(EventoVisita);
        if (visita != null) {
            entity.setVisita(visita);
        }
        entityManager.persist(entity);
        return EventoVisitaConverter.entity2PersistenceDTO(entity);
    }

    public List<EventoVisitaDTO> getEventoVisitas() {
        Query q = entityManager.createQuery("select u from EventoVisitaEntity u");
        return EventoVisitaConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public EventoVisitaPageDTO getEventoVisitas(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from EventoVisitaEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from EventoVisitaEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        EventoVisitaPageDTO response = new EventoVisitaPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(EventoVisitaConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public EventoVisitaDTO getEventoVisita(Long id) {
        return EventoVisitaConverter.entity2PersistenceDTO(entityManager.find(EventoVisitaEntity.class, id));
    }

    public void deleteEventoVisita(Long id) {
        EventoVisitaEntity entity = entityManager.find(EventoVisitaEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateEventoVisita(EventoVisitaDTO EventoVisita) {
        EventoVisitaEntity entity = entityManager.merge(EventoVisitaConverter.persistenceDTO2Entity(EventoVisita));
        EventoEntity evento = this.getSelectedEvento(EventoVisita);
        if (evento != null) {
            entity.setEvento(evento);
        }
        VisitaEntity visita = this.getSelectedVisita(EventoVisita);
        if (visita != null) {
            entity.setVisita(visita);
        }
        EventoVisitaConverter.entity2PersistenceDTO(entity);
    }
    
    private VisitaEntity getSelectedVisita(EventoVisitaDTO EventoVisita){
        if (EventoVisita != null && EventoVisita.getVisita() != null && EventoVisita.getVisita() != null) {
            return entityManager.find(VisitaEntity.class, EventoVisita.getVisita());
        }else{
            return null;
        }
    } 
    
    private EventoEntity getSelectedEvento(EventoVisitaDTO Evento){
        if (Evento != null && Evento.getEvento() != null && Evento.getEvento() != null) {
            return entityManager.find(EventoEntity.class, Evento.getEvento());
        }else{
            return null;
        }
    }   
}
