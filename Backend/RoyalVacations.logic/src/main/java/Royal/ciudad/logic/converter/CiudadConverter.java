package Royal.ciudad.logic.converter;

import Royal.ciudad.logic.dto.CiudadDTO;
import Royal.ciudad.logic.entity.CiudadEntity;
import java.util.ArrayList;
import java.util.List;

public class CiudadConverter {

    public static CiudadDTO entity2PersistenceDTO(CiudadEntity entity) {
        if (entity != null) {
            CiudadDTO dto = new CiudadDTO();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setPopulation(entity.getPopulation());
            if (entity.getCountry() != null) {
                dto.setCountry(entity.getCountry().getId());
            }
            return dto;
        } else {
            return null;
        }
    }

    public static CiudadEntity persistenceDTO2Entity(CiudadDTO dto) {
        if (dto != null) {
            CiudadEntity entity = new CiudadEntity();
            entity.setId(dto.getId());

            entity.setName(dto.getName());

            entity.setPopulation(dto.getPopulation());

            return entity;
        } else {
            return null;
        }
    }

    public static List<CiudadDTO> entity2PersistenceDTOList(List<CiudadEntity> entities) {
        List<CiudadDTO> dtos = new ArrayList<CiudadDTO>();
        for (CiudadEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<CiudadEntity> persistenceDTO2EntityList(List<CiudadDTO> dtos) {
        List<CiudadEntity> entities = new ArrayList<CiudadEntity>();
        for (CiudadDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
