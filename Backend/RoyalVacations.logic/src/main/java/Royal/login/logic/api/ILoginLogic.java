package Royal.login.logic.api;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Royal.login.logic.dto.LoginDTO;
import Royal.login.logic.dto.LoginPageDTO;
import java.util.List;

/**
 *
 * @author estudiante
 */

public interface ILoginLogic {

    public LoginDTO createLogin(LoginDTO detail);

    public List<LoginDTO> getLogines();

    public LoginPageDTO getLogines(Integer page, Integer maxRecords);

    public LoginDTO getLogin(Long id);

    public void deleteLogin(Long id);

    public void updateLogin(LoginDTO detail);
}
