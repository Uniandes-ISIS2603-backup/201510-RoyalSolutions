/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import converter.ItinerarioConverter;
import dto.ItinerarioDTO;
import entity.ItinerarioEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author estudiante
 */
public class ItinerarioLogic 
{
    @PersistenceContext(unitName = "SportClassPU")
    protected EntityManager entityManager;

    public ItinerarioDTO createItinerario(ItinerarioDTO country) {
        ItinerarioEntity entity = ItinerarioConverter.persistenceDTO2Entity(country);
        entityManager.persist(entity);
        return ItinerarioConverter.entity2PersistenceDTO(entity);
    }
    
    public List<ItinerarioDTO> getCountries() {
        Query q = entityManager.createQuery("select u from CountryEntity u");
        return ItinerarioConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
     public ItinerarioDTO getItinerario(String name) {
	        return ItinerarioConverter.entity2PersistenceDTO(entityManager.find(ItinerarioEntity.class, name));
	    }

	    public void deleteItinerario(String name) {
	        ItinerarioEntity entity = entityManager.find(ItinerarioEntity.class, name);
	        entityManager.remove(entity);
	    }

	    public void updateItinerario(ItinerarioDTO Itinerario) {
	        ItinerarioEntity entity = entityManager.merge(ItinerarioConverter.persistenceDTO2Entity(Itinerario));
	        ItinerarioConverter.entity2PersistenceDTO(entity);
	    }    
}