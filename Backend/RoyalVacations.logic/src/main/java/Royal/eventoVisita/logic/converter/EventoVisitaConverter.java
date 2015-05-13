/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.eventoVisita.logic.converter;

import Royal.eventoVisita.logic.dto.EventoVisitaDTO;
import Royal.eventoVisita.logic.entity.EventoVisitaEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class EventoVisitaConverter 
{
    public static EventoVisitaDTO entity2PersistenceDTO(EventoVisitaEntity entity) {
        if (entity != null) {
            EventoVisitaDTO dto = new EventoVisitaDTO();
            dto.setId(entity.getId());
            if (entity.getEvento() != null) {
                dto.setEvento(entity.getEvento().getId());
            }
            if (entity.getVisita() != null) {
                dto.setVisita(entity.getVisita().getId());
            }
            return dto;
        } else {
            return null;
        }
    }

    public static EventoVisitaEntity persistenceDTO2Entity(EventoVisitaDTO dto) {
        if (dto != null) {
            EventoVisitaEntity entity = new EventoVisitaEntity();
            entity.setId(dto.getId());
            return entity;
        } else {
            return null;
        }
    }

    public static List<EventoVisitaDTO> entity2PersistenceDTOList(List<EventoVisitaEntity> entities) {
        List<EventoVisitaDTO> dtos = new ArrayList<EventoVisitaDTO>();
        for (EventoVisitaEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<EventoVisitaEntity> persistenceDTO2EntityList(List<EventoVisitaDTO> dtos) {
        List<EventoVisitaEntity> entities = new ArrayList<EventoVisitaEntity>();
        for (EventoVisitaDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
