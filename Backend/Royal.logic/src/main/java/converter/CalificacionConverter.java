/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;
import dto.CalificacionDTO;
import entity.CalificacionEntity;
import java.util.ArrayList;
import java.util.List;

public class CalificacionConverter {
    public static CalificacionDTO entity2PersistenceDTO(CalificacionEntity entity) {
	        if (entity != null) {
	            CalificacionDTO dto = new CalificacionDTO();
	            dto.setFecha(entity.getFecha());
                    dto.setNombre(entity.getNombre());
                    dto.setValor(entity.getValor());
                    dto.setTipo(entity.getTipo());
	            return dto;
	        } else {
	            return null;
	        }
	    }

	    public static CalificacionEntity persistenceDTO2Entity(CalificacionDTO dto) {
	        if (dto != null) {
	            CalificacionEntity entity = new CalificacionEntity();
	            entity.setFecha(dto.getFecha());
                    entity.setTipo(dto.getTipo());
                    entity.setValor(dto.getValor());
                    entity.setNombre(dto.getNombre());

	            return entity;
	        } else {
	            return null;
	        }
	    }

	    public static List<CalificacionDTO> entity2PersistenceDTOList(List<CalificacionEntity> entities) {
	        List<CalificacionDTO> dtos = new ArrayList<CalificacionDTO>();
	        for (CalificacionEntity entity : entities) {
	            dtos.add(entity2PersistenceDTO(entity));
	        }
	        return dtos;
	    }

	    public static List<CalificacionEntity> persistenceDTO2EntityList(List<CalificacionDTO> dtos) {
	        List<CalificacionEntity> entities = new ArrayList<CalificacionEntity>();
	        for (CalificacionDTO dto : dtos) {
	            entities.add(persistenceDTO2Entity(dto));
	        }
	        return entities;
	    }
	
	
}
