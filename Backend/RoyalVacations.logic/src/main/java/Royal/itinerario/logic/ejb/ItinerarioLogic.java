/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.itinerario.logic.ejb;

import Royal.itinerario.logic.api.IItinerarioLogic;
import Royal.itinerario.logic.converter.ItinerarioConverter;
import Royal.itinerario.logic.dto.ItinerarioDTO;
import Royal.itinerario.logic.entity.ItinerarioEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author estudiante
 */

@Stateless
@LocalBean
public class ItinerarioLogic implements IItinerarioLogic
{
    @PersistenceContext(unitName = "ItineratioClassPU")
    protected EntityManager entityManager;

    public ItinerarioDTO createItinerario(ItinerarioDTO country) {
        ItinerarioEntity entity = ItinerarioConverter.persistenceDTO2Entity(country);
        entityManager.persist(entity);
        return ItinerarioConverter.entity2PersistenceDTO(entity);
    }
    
    public List<ItinerarioDTO> getItinerarios() {
        Query q = entityManager.createQuery("select u from ItinerarioEntity u");
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