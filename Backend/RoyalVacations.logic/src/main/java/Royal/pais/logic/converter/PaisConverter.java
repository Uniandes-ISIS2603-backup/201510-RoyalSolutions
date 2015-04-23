/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.pais.logic.converter;

import Royal.pais.logic.dto.PaisDTO;
import Royal.pais.logic.entity.PaisEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public class PaisConverter {
    public static PaisDTO entity2PersistenceDTO(PaisEntity entity) {
        if (entity != null) {
            PaisDTO dto = new PaisDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setPopulation(entity.getPopulation());
            return dto;
        } else {
            return null;
        }
    }

    public static PaisEntity persistenceDTO2Entity(PaisDTO dto) {
        if (dto != null) {
            PaisEntity entity = new PaisEntity();
            entity.setId(dto.getId());

            entity.setName(dto.getName());

            entity.setPopulation(dto.getPopulation());

            return entity;
        } else {
            return null;
        }
    }

    public static List<PaisDTO> entity2PersistenceDTOList(List<PaisEntity> entities) {
        List<PaisDTO> dtos = new ArrayList<PaisDTO>();
        for (PaisEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<PaisEntity> persistenceDTO2EntityList(List<PaisDTO> dtos) {
        List<PaisEntity> entities = new ArrayList<PaisEntity>();
        for (PaisDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
