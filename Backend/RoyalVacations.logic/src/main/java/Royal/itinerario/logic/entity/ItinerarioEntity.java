/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.itinerario.logic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author estudiante
 */
public class ItinerarioEntity 
{
    
    @GeneratedValue(generator = "Itinerario")
    
    
    @Id
    @Column (name = "ITINERARIO_ID")
    private Long id;
    
    private String nombre;
     
    public String getName() 
    {
        return nombre;
    }

    public void setName(String name) 
    {
        this.nombre = name;
    }    
     public Long getId() {
        return id;
    }

    public void setId(Long pid) {
        this.id = pid;
    }
}
