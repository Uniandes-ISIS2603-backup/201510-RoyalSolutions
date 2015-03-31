/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.servicio.logic.ejb;

import Royal.servicio.logic.converter.ServicioConverter;
import Royal.servicio.logic.dto.ServicioDTO;
import Royal.servicio.logic.entity.ServicioEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author estudiante
 */
public class ServicioLogic {
 
    @PersistenceContext(unitName = "ServicioClassPU")
    protected EntityManager entityManager;

    public ServicioDTO createServicio(ServicioDTO country) {
        ServicioEntity entity = ServicioConverter.persistenceDTO2Entity(country);
        entityManager.persist(entity);
        return ServicioConverter.entity2PersistenceDTO(entity);
    }
    
    public List<ServicioDTO> getServicios() {
        Query q = entityManager.createQuery("select u from ServicioEntity u");
        return ServicioConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
     public ServicioDTO getServicio(String name) {
	        return ServicioConverter.entity2PersistenceDTO(entityManager.find(ServicioEntity.class, name));
	    }

	    public void deleteServicio(String name) {
	        ServicioEntity entity = entityManager.find(ServicioEntity.class, name);
	        entityManager.remove(entity);
	    }

	    public void updateServicio(ServicioDTO Servicio) {
	        ServicioEntity entity = entityManager.merge(ServicioConverter.persistenceDTO2Entity(Servicio));
	        ServicioConverter.entity2PersistenceDTO(entity);
	    }    
	
    
}
