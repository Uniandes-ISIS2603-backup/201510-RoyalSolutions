/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.itinerario.logic.ejb;

import Royal.itinerario.logic.api.IItinerarioLogic;
import Royal.itinerario.logic.converter.ItinerarioConverter;
import Royal.itinerario.logic.dto.ItinerarioDTO;
import Royal.itinerario.logic.dto.ItinerarioPageDTO;
import Royal.itinerario.logic.entity.ItinerarioEntity;
import Royal.login.logic.entity.LoginEntity;
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
    @PersistenceContext(unitName = "RoyalPU")
    protected EntityManager entityManager;
    
    public ItinerarioDTO createItinerario(ItinerarioDTO itinerario) {
        ItinerarioEntity entity = ItinerarioConverter.persistenceDTO2Entity(itinerario);
        LoginEntity login = this.getSelectedUsuario(itinerario);
        if (login != null) {
            entity.setUsuario(login);
        }
        entityManager.persist(entity);
        return ItinerarioConverter.entity2PersistenceDTO(entity);
    }

    public List<ItinerarioDTO> getItinerarios() {
        Query q = entityManager.createQuery("select u from ItinerarioEntity u");
        return ItinerarioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public ItinerarioDTO getItinerario(Long id) {
        return ItinerarioConverter.entity2PersistenceDTO(entityManager.find(ItinerarioEntity.class, id));
    }

    public void deleteItinerario(Long id) {
        ItinerarioEntity entity = entityManager.find(ItinerarioEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateItinerario(ItinerarioDTO country) {
        ItinerarioEntity entity = entityManager.merge(ItinerarioConverter.persistenceDTO2Entity(country));
        ItinerarioConverter.entity2PersistenceDTO(entity);
    }

    public ItinerarioPageDTO getItinerarios(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from ItinerarioEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ItinerarioEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ItinerarioPageDTO response = new ItinerarioPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ItinerarioConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }
    
    private LoginEntity getSelectedUsuario(ItinerarioDTO itinerario){
        if (itinerario != null && itinerario.getUsuario() != null && itinerario.getUsuario() != null) {
            return entityManager.find(LoginEntity.class, itinerario.getUsuario());
        }else{
            return null;
        }
    }  
}