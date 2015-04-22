/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.pais.logic.ejb;
import Royal.ciudad.logic.api.ICiudadLogic;
import Royal.ciudad.logic.converter.CiudadConverter;
import Royal.ciudad.logic.dto.CiudadDTO;
import Royal.pais.logic.api.IPaisLogic;
import Royal.pais.logic.converter.PaisConverter;
import Royal.pais.logic.dto.PaisDTO;
import Royal.pais.logic.dto.CiudadPageDTO;
import Royal.pais.logic.entity.PaisEntity;
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
public class PaisLogic implements IPaisLogic
{
     @PersistenceContext(unitName = "RoyalPU")
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

	public PaisDTO getPais(Long id) {
		return PaisConverter.entity2PersistenceDTO(entityManager.find(PaisEntity.class, id));
	}

	public void deletePais(Long id) {
		PaisEntity entity = entityManager.find(PaisEntity.class, id);
		entityManager.remove(entity);
	}

	public void updatePais(PaisDTO pais) {
		PaisEntity entity = entityManager.merge(PaisConverter.persistenceDTO2Entity(pais));
		PaisConverter.entity2PersistenceDTO(entity);
	}      
       
}
