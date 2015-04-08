/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.pais.logic.ejb;
import Royal.pais.logic.converter.PaisConverter;
import Royal.pais.logic.dto.PaisDTO;
import Royal.pais.logic.entity.PaisEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author estudiante
 */
public class PaisLogic 
{
     @PersistenceContext(unitName = "PaisClassPU")
	protected EntityManager entityManager;
  
	public PaisDTO createPais(PaisDTO pais) {
		PaisEntity entity = PaisConverter.persistenceDTO2Entity(pais);
		entityManager.persist(entity);
		return PaisConverter.entity2PersistenceDTO(entity);
	}

	public List<PaisDTO> getPaises() {
		Query q = entityManager.createQuery("select u from PaisEntity u");
		return PaisConverter.entity2PersistenceDTOList(q.getResultList());
	}

	public PaisDTO getPais(String name) {
		return PaisConverter.entity2PersistenceDTO(entityManager.find(PaisEntity.class, name));
	}

	public void deletePais(String name) {
		PaisEntity entity = entityManager.find(PaisEntity.class, name);
		entityManager.remove(entity);
	}

	public void updatePais(PaisDTO pais) {
		PaisEntity entity = entityManager.merge(PaisConverter.persistenceDTO2Entity(pais));
		PaisConverter.entity2PersistenceDTO(entity);
	}      
}
