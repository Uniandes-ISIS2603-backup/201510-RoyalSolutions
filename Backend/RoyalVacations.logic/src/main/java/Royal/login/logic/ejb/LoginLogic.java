/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.login.logic.ejb;

import Royal.login.logic.api.ILoginLogic;
import Royal.login.logic.converter.LoginConverter;
import Royal.login.logic.dto.LoginDTO;
import Royal.login.logic.dto.LoginPageDTO;
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

@Default
@Stateless
@LocalBean
public class LoginLogic implements ILoginLogic
{
    @PersistenceContext(unitName = "RoyalPU")
    protected EntityManager entityManager;

    public LoginDTO createLogin(LoginDTO Login) {
        LoginEntity entity = LoginConverter.persistenceDTO2Entity(Login);
        entityManager.persist(entity);
        return LoginConverter.entity2PersistenceDTO(entity);
    }

    public List<LoginDTO> getLogines() {
        Query q = entityManager.createQuery("select u from LoginEntity u");
        return LoginConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public LoginPageDTO getLogines(Integer page, Integer maxRecords) {
        Query count = entityManager.createQuery("select count(u) from LoginEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from LoginEntity u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        LoginPageDTO response = new LoginPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(LoginConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public LoginDTO getLogin(Long id) {
        return LoginConverter.entity2PersistenceDTO(entityManager.find(LoginEntity.class, id));
    }

    public void deleteLogin(Long id) {
        LoginEntity entity = entityManager.find(LoginEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateLogin(LoginDTO Login) {
        LoginEntity entity = entityManager.merge(LoginConverter.persistenceDTO2Entity(Login));
        LoginConverter.entity2PersistenceDTO(entity);
    }
}
