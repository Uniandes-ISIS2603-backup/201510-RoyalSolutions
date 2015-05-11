/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.evento.logic.ejb;

import Royal.ciudad.logic.entity.CiudadEntity;
import Royal.evento.logic.api.IEventoLogic;
import Royal.evento.logic.converter.EventoConverter;
import Royal.evento.logic.dto.EventoDTO;
import Royal.evento.logic.dto.EventoPageDTO;
import Royal.evento.logic.entity.EventoEntity;
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
public class EventoLogic implements IEventoLogic
{
    @PersistenceContext(unitName = "RoyalPU")
    protected EntityManager entityManager;

    public EventoDTO createEvento(EventoDTO Evento) {
        EventoEntity entity = EventoConverter.persistenceDTO2Entity(Evento);
        CiudadEntity ciudad = this.getSelectedCiudad(Evento);
        if (ciudad != null) {
            entity.setCiudad(ciudad);
        }
        entityManager.persist(entity);
        return EventoConverter.entity2PersistenceDTO(entity);
    }

    public List<EventoDTO> getEventos() {
        Query q = entityManager.createQuery("select u from EventoEntity u");
        return EventoConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public EventoPageDTO getEventos(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from EventoEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from EventoEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        EventoPageDTO response = new EventoPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(EventoConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public EventoDTO getEvento(Long id) {
        return EventoConverter.entity2PersistenceDTO(entityManager.find(EventoEntity.class, id));
    }

    public void deleteEvento(Long id) {
        EventoEntity entity = entityManager.find(EventoEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateEvento(EventoDTO Evento) {
        EventoEntity entity = entityManager.merge(EventoConverter.persistenceDTO2Entity(Evento));
        CiudadEntity ciudad = this.getSelectedCiudad(Evento);
        if (ciudad != null) {
            entity.setCiudad(ciudad);
        }
        EventoConverter.entity2PersistenceDTO(entity);
    }
    private CiudadEntity getSelectedCiudad(EventoDTO Evento){
        if (Evento != null && Evento.getCiudad() != null && Evento.getCiudad() != null) {
            return entityManager.find(CiudadEntity.class, Evento.getCiudad());
        }else{
            return null;
        }
    }   
}