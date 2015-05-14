package Royal.ciudad.logic.ejb;

import Royal.pais.logic.entity.PaisEntity;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import Royal.ciudad.logic.api.ICiudadLogic;
import Royal.ciudad.logic.dto.CiudadDTO;
import Royal.ciudad.logic.dto.CiudadPageDTO;
import Royal.ciudad.logic.converter.CiudadConverter;
import Royal.ciudad.logic.entity.CiudadEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Default
@Stateless
@LocalBean
public class CiudadLogic implements ICiudadLogic {

    @PersistenceContext(unitName = "RoyalPU")
    protected EntityManager entityManager;

    public CiudadDTO createCiudad(CiudadDTO ciudad) {
        CiudadEntity entity = CiudadConverter.persistenceDTO2Entity(ciudad);
        PaisEntity country = this.getSelectedCountry(ciudad);
        if (country != null) {
            entity.setCountry(country);
        }
        entityManager.persist(entity);
        return CiudadConverter.entity2PersistenceDTO(entity);
    }

    public List<CiudadDTO> getCiudades() {
        Query q = entityManager.createQuery("select u from CiudadEntity u");
        return CiudadConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public CiudadPageDTO getCiudades(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from CiudadEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from CiudadEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        CiudadPageDTO response = new CiudadPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(CiudadConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public CiudadDTO getCiudad(Long id) {
        return CiudadConverter.entity2PersistenceDTO(entityManager.find(CiudadEntity.class, id));
    }

    public void deleteCiudad(Long id) {
        CiudadEntity entity = entityManager.find(CiudadEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateCiudad(CiudadDTO ciudad) {
        CiudadEntity entity = entityManager.merge(CiudadConverter.persistenceDTO2Entity(ciudad));
        PaisEntity country = this.getSelectedCountry(ciudad);
        if (country != null) {
            entity.setCountry(country);
        }
        CiudadConverter.entity2PersistenceDTO(entity);
    }
    private PaisEntity getSelectedCountry(CiudadDTO ciudad){
        if (ciudad != null && ciudad.getCountry() != null) {
            return entityManager.find(PaisEntity.class, ciudad.getCountry());
        }else{
            return null;
        }
    }
}
