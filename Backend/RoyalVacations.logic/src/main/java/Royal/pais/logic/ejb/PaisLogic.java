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
@Default
@Stateless
@LocalBean
public class PaisLogic implements IPaisLogic
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
        
        public CiudadDTO createCiudadAPais(CiudadDTO ciudad, Long idPais, ICiudadLogic ciudadLogic)
        {
            PaisEntity entidad = entityManager.find(PaisEntity.class, idPais);
            CiudadDTO respuesta = null;
            if ( entidad != null)
            {
                respuesta = ciudadLogic.createCiudad(ciudad);
            }
         return respuesta;
        }
         public void deleteCiudadAPais(CiudadDTO ciudad, Long idPais, ICiudadLogic ciudadLogic)
        {
            PaisEntity entidad = entityManager.find(PaisEntity.class, idPais);
            if ( entidad != null)
            {
                ciudadLogic.deleteCiudad(ciudad.getName());
            }
        }
         public CiudadPageDTO getCiudadesDePais(Long idPais, Integer pagina, Integer datosMaximos)
                 
         {
         Query cuenta = entityManager.createQuery("select count(u) from CiudadEntity u");
        Long cuentaReg = 0L;
        cuentaReg = Long.parseLong(cuenta.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from CiudadEntity u where u.pais = '"+idPais+"'");
        if(pagina != null && datosMaximos != null){
            q.setFirstResult((pagina-1)*datosMaximos);
            q.setMaxResults(datosMaximos);
        }
        CiudadPageDTO respuesta = new CiudadPageDTO();
        respuesta.setTotalCiudades(cuentaReg);
        respuesta.setCiudades(CiudadConverter.entity2PersistenceDTOList(q.getResultList()));
        return respuesta;
         }
         
          public void updateCiudadAPais(CiudadDTO ciudad, Long idPais, ICiudadLogic ciudadLogic)
        {
            PaisEntity entidad = entityManager.find(PaisEntity.class, idPais);
            if ( entidad != null)
            {
                ciudadLogic.updateCiudad(ciudad);
            }
        }
}
