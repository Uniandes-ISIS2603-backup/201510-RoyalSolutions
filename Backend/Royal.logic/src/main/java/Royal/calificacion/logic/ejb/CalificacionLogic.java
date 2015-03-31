/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.calificacion.logic.ejb;

import Royal.calificacion.logic.converter.CalificacionConverter;
import Royal.calificacion.logic.dto.CalificacionDTO;
import Royal.calificacion.logic.entity.CalificacionEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author estudiante
 */
public class CalificacionLogic 
{
    @PersistenceContext(unitName = "CalificacionClassPU")
	    protected EntityManager entityManager;

	    public CalificacionDTO createCalificacion(CalificacionDTO calif) {
	        CalificacionEntity entity = CalificacionConverter.persistenceDTO2Entity(calif);
	        entityManager.persist(entity);
	        return CalificacionConverter.entity2PersistenceDTO(entity);
	    }
	    
	    public List<CalificacionDTO> getCalificacions() {
	        Query q = entityManager.createQuery("select u from CalificacionEntity u");
	        return CalificacionConverter.entity2PersistenceDTOList(q.getResultList());
	    }
	    
	     public CalificacionDTO getCalificacion(String name) {
		        return CalificacionConverter.entity2PersistenceDTO(entityManager.find(CalificacionEntity.class, name));
		    }

		    public void deleteCalificacion(String name) {
		        CalificacionEntity entity = entityManager.find(CalificacionEntity.class, name);
		        entityManager.remove(entity);
		    }

		    public void updateCalificacion(CalificacionDTO Calificacion) {
		        CalificacionEntity entity = entityManager.merge(CalificacionConverter.persistenceDTO2Entity(Calificacion));
		        CalificacionConverter.entity2PersistenceDTO(entity);
		    }    
}
