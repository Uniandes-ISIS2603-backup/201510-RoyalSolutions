/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

/**
 *
 * @author estudiante
 */

import dto.UsuarioDTO;
import entity.UsuarioEntity;
import java.util.ArrayList;
import java.util.List;

public class UsuarioConverter {
    public static UsuarioDTO entity2PersistenceDTO(UsuarioEntity entity) {
        if (entity != null) {
            UsuarioDTO dto = new UsuarioDTO();
            dto.setName(entity.getName());
            dto.setPassword(entity.getPassword());
            return dto;
        } else {
            return null;
        }
    }

    public static UsuarioEntity persistenceDTO2Entity(UsuarioDTO dto) {
        if (dto != null) {
            UsuarioEntity entity = new UsuarioEntity();
            entity.setName(dto.getName());
            entity.setPassword(dto.getPassword());

            return entity;
        } else {
            return null;
        }
    }

    public static List<UsuarioDTO> entity2PersistenceDTOList(List<UsuarioEntity> entities) {
        List<UsuarioDTO> dtos = new ArrayList<UsuarioDTO>();
        for (UsuarioEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<UsuarioEntity> persistenceDTO2EntityList(List<UsuarioDTO> dtos) {
        List<UsuarioEntity> entities = new ArrayList<UsuarioEntity>();
        for (UsuarioDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
	
	
	
	
}
