/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.visita.logic.converter;

import Royal.visita.logic.dto.VisitaDTO;
import Royal.visita.logic.entity.VisitaEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class VisitaConverter 
{
     public static VisitaDTO entity2PersistenceDTO(VisitaEntity entity) {
        if (entity != null) {
            VisitaDTO dto = new VisitaDTO();
            dto.setId(entity.getId());
            dto.setInicio(entity.getInicio());
            dto.setFin(entity.getFin());
            if (entity.getCiudad() != null) {
                dto.setCiudad(entity.getCiudad().getId());
            }
            if (entity.getItinerario() != null) {
                dto.setItinerario(entity.getItinerario().getId());
            }
            return dto;
        } else {
            return null;
        }
    }

    public static VisitaEntity persistenceDTO2Entity(VisitaDTO dto) {
        if (dto != null) {
            VisitaEntity entity = new VisitaEntity();
            entity.setId(dto.getId());
            entity.setInicio(dto.getInicio());
            entity.setFin(dto.getFin());

            return entity;
        } else {
            return null;
        }
    }

    public static List<VisitaDTO> entity2PersistenceDTOList(List<VisitaEntity> entities) {
        List<VisitaDTO> dtos = new ArrayList<VisitaDTO>();
        for (VisitaEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<VisitaEntity> persistenceDTO2EntityList(List<VisitaDTO> dtos) {
        List<VisitaEntity> entities = new ArrayList<VisitaEntity>();
        for (VisitaDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}