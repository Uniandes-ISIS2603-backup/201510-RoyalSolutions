/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.ciudad.logic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 *
 * @author estudiante
 */
public class CiudadEntity
{
    @Id
    @GeneratedValue(generator = "Ciudad")
    
    private String nombre;
 private String pais;
     
    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }
    
    public String getCountry() {
        return pais;
    }

    public void setCountry(String name) {
        this.pais = name;
    }   
}
