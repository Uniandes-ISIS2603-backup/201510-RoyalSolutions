/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.login.logic.converter;

import Royal.login.logic.dto.LoginDTO;
import Royal.login.logic.entity.LoginEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class LoginConverter 
{
    public static LoginDTO entity2PersistenceDTO(LoginEntity entity) {
        if (entity != null) {
            LoginDTO dto = new LoginDTO();
            dto.setId(entity.getId());
            dto.setLogin(entity.getLogin());
            dto.setContrasena(entity.getContrasena());
            return dto;
        } else {
            return null;
        }
    }

    public static LoginEntity persistenceDTO2Entity(LoginDTO dto) {
        if (dto != null) {
            LoginEntity entity = new LoginEntity();
            entity.setId(dto.getId());

            entity.setLogin(dto.getLogin());

            entity.setContrasena(dto.getContrasena());

            return entity;
        } else {
            return null;
        }
    }

    public static List<LoginDTO> entity2PersistenceDTOList(List<LoginEntity> entities) {
        List<LoginDTO> dtos = new ArrayList<LoginDTO>();
        for (LoginEntity entity : entities) {
            dtos.add(entity2PersistenceDTO(entity));
        }
        return dtos;
    }

    public static List<LoginEntity> persistenceDTO2EntityList(List<LoginDTO> dtos) {
        List<LoginEntity> entities = new ArrayList<LoginEntity>();
        for (LoginDTO dto : dtos) {
            entities.add(persistenceDTO2Entity(dto));
        }
        return entities;
    }
}
