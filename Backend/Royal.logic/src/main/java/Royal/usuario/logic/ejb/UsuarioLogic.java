/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.usuario.logic.ejb;

import Royal.usuario.logic.converter.UsuarioConverter;
import Royal.usuario.logic.dto.UsuarioDTO;
import Royal.usuario.logic.entity.UsuarioEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author estudiante
 */
public class UsuarioLogic {
    
    @PersistenceContext(unitName = "UsuarioClassPU")
    protected EntityManager entityManager;

    public UsuarioDTO createUsuario(UsuarioDTO user) {
        UsuarioEntity entity = UsuarioConverter.persistenceDTO2Entity(user);
        entityManager.persist(entity);
        return UsuarioConverter.entity2PersistenceDTO(entity);
    }
    
    public List<UsuarioDTO> getUsuarios() {
        Query q = entityManager.createQuery("select u from UsuarioEntity u");
        return UsuarioConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
     public UsuarioDTO getUsuario(String name) {
	        return UsuarioConverter.entity2PersistenceDTO(entityManager.find(UsuarioEntity.class, name));
	    }

	    public void deleteUsuario(String name) {
	        UsuarioEntity entity = entityManager.find(UsuarioEntity.class, name);
	        entityManager.remove(entity);
	    }

	    public void updateUsuario(UsuarioDTO Usuario) {
	        UsuarioEntity entity = entityManager.merge(UsuarioConverter.persistenceDTO2Entity(Usuario));
	        UsuarioConverter.entity2PersistenceDTO(entity);
	    }    
}
