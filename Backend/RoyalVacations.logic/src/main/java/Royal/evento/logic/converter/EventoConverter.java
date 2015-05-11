/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.evento.logic.converter;

import Royal.evento.logic.dto.EventoDTO;
import Royal.evento.logic.entity.EventoEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class EventoConverter {
    
    public static EventoDTO entity2PersistenceDTO(EventoEntity entity) {
        if (entity != null) {
            EventoDTO dto = new EventoDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setFecha(entity.getFecha());
            if (entity.getCiudad() != null) {
                dto.setCiudad(entity.getCiudad().getId());
            }
            return dto;
        } else {
            return null;
        }
    }

    public static EventoEntity persistenceDTO2Entity(EventoDTO dto) {
        if (dto != null) {
            EventoEntity entity = new EventoEntity();
            entity.setId(dto.getId());

            entity.setName(dto.getName());

            entity.setFecha(dto.getFecha());

            return entity;
        } else {
            return null;
        }
    }

    public static List<EventoDTO> entity2PersistenceDTOList(List<EventoEntity> entities) {
        List<EventoDTO> dtos = new ArrayList<EventoDTO>();
        for (EventoEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<EventoEntity> persistenceDTO2EntityList(List<EventoDTO> dtos) {
        List<EventoEntity> entities = new ArrayList<EventoEntity>();
        for (EventoDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
