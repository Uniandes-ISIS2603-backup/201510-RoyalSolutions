/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.servicio.logic.converter;

import Royal.servicio.logic.dto.ServicioDTO;
import Royal.servicio.logic.entity.ServicioEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class ServicioConverter 
{
    public static ServicioDTO entity2PersistenceDTO(ServicioEntity entity) {
        if (entity != null) {
            ServicioDTO dto = new ServicioDTO();
            dto.setName(entity.getName());
            dto.setDate(entity.getDate());
            dto.setType(entity.getType());
            dto.setCity(entity.getCity());
            
            return dto;
        } else {
            return null;
        }
    }

    public static ServicioEntity persistenceDTO2Entity(ServicioDTO dto) {
        if (dto != null) {
            ServicioEntity entity = new ServicioEntity();
            entity.setName(dto.getName());
            entity.setDate(dto.getDate());
            entity.setType(dto.getType());
            entity.setCity(dto.getCity());
            return entity;
        } else {
            return null;
        }
    }

    public static List<ServicioDTO> entity2PersistenceDTOList(List<ServicioEntity> entities) {
        List<ServicioDTO> dtos = new ArrayList<ServicioDTO>();
        for (ServicioEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<ServicioEntity> persistenceDTO2EntityList(List<ServicioDTO> dtos) {
        List<ServicioEntity> entities = new ArrayList<ServicioEntity>();
        for (ServicioDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }    
}