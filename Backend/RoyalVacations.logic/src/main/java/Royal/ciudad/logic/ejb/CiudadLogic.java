/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.ciudad.logic.ejb;

import Royal.ciudad.logic.api.ICiudadLogic;
import Royal.ciudad.logic.converter.CiudadConverter;
import Royal.ciudad.logic.dto.CiudadDTO;
import Royal.ciudad.logic.entity.CiudadEntity;
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
@Default
@Stateless
@LocalBean
public class CiudadLogic implements ICiudadLogic
{
        @PersistenceContext(unitName = "CiudadClassPU")
	protected EntityManager entityManager;
  
	public CiudadDTO createCiudad(CiudadDTO ciudad) {
		CiudadEntity entity = CiudadConverter.persistenceDTO2Entity(ciudad);
		entityManager.persist(entity);
		return CiudadConverter.entity2PersistenceDTO(entity);
	}

	public List<CiudadDTO> getCiudades() {
		Query q = entityManager.createQuery("select u from CiudadEntity u");
		return CiudadConverter.entity2PersistenceDTOList(q.getResultList());
	}

	public CiudadDTO getCiudad(String name) {
		return CiudadConverter.entity2PersistenceDTO(entityManager.find(CiudadEntity.class, name));
	}

	public void deleteCiudad(String name) {
		CiudadEntity entity = entityManager.find(CiudadEntity.class, name);
		entityManager.remove(entity);
	}

	public void updateCiudad(CiudadDTO Ciudad) {
		CiudadEntity entity = entityManager.merge(CiudadConverter.persistenceDTO2Entity(Ciudad));
		CiudadConverter.entity2PersistenceDTO(entity);
	}  
        
        
}