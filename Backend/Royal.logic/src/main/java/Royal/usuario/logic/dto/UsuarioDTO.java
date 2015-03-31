/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.usuario.logic.dto;

/**
 *
 * @author estudiante
 */
public class UsuarioDTO 
{
    private String username;
   
    private String password;
    
       public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public void setPassword(String pPassword) {
        this.password = pPassword;
    }
    
      public String getPassword() {
        return password;
    }    
}