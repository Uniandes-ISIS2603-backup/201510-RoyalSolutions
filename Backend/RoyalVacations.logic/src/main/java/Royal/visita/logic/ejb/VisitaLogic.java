/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.visita.logic.ejb;

import Royal.ciudad.logic.entity.CiudadEntity;
import Royal.itinerario.logic.entity.ItinerarioEntity;
import Royal.visita.logic.api.IVisitaLogic;
import Royal.visita.logic.converter.VisitaConverter;
import Royal.visita.logic.dto.VisitaDTO;
import Royal.visita.logic.dto.VisitaPageDTO;
import Royal.visita.logic.entity.VisitaEntity;
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
public class VisitaLogic implements IVisitaLogic
{
    @PersistenceContext(unitName = "RoyalPU")
    protected EntityManager entityManager;

    public VisitaDTO createVisita(VisitaDTO visita) {
        VisitaEntity entity = VisitaConverter.persistenceDTO2Entity(visita);
        CiudadEntity ciudad = this.getSelectedCiudad(visita);
        if (ciudad != null) {
            entity.setCiudad(ciudad);
        }
        ItinerarioEntity itinerario = this.getSelectedItinerario(visita);
        if (itinerario != null) {
            entity.setItinerario(itinerario);
        }
        entityManager.persist(entity);
        return VisitaConverter.entity2PersistenceDTO(entity);
    }

    public List<VisitaDTO> getVisitas() {
        Query q = entityManager.createQuery("select u from VisitaEntity u");
        return VisitaConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public VisitaPageDTO getVisitas(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from VisitaEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from VisitaEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        VisitaPageDTO response = new VisitaPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(VisitaConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public VisitaDTO getVisita(Long id) {
        return VisitaConverter.entity2PersistenceDTO(entityManager.find(VisitaEntity.class, id));
    }

    public void deleteVisita(Long id) {
        VisitaEntity entity = entityManager.find(VisitaEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateVisita(VisitaDTO Visita) {
        VisitaEntity entity = entityManager.merge(VisitaConverter.persistenceDTO2Entity(Visita));
        CiudadEntity Ciudad = this.getSelectedCiudad(Visita);
        if (Ciudad != null) {
            entity.setCiudad(Ciudad);
        }
        ItinerarioEntity itinerario = this.getSelectedItinerario(Visita);
        if (Ciudad != null) {
            entity.setItinerario(itinerario);
        }
        VisitaConverter.entity2PersistenceDTO(entity);
    }
    private CiudadEntity getSelectedCiudad(VisitaDTO Visita){
        if (Visita != null && Visita.getCiudad() != null && Visita.getCiudad() != null) {
            return entityManager.find(CiudadEntity.class, Visita.getCiudad());
        }else{
            return null;
        }
    }
    
    private ItinerarioEntity getSelectedItinerario(VisitaDTO Visita){
        if (Visita != null && Visita.getItinerario() != null && Visita.getItinerario() != null) {
            return entityManager.find(ItinerarioEntity.class, Visita.getItinerario());
        }else{
            return null;
        }
    }
}
