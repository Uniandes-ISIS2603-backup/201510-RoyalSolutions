/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author estudiante
 */
public class ItinerarioEntity 
{
    @Id
    @GeneratedValue(generator = "Itinerario")
    
    private String nombre;
     
    public String getName() 
    {
        return nombre;
    }

    public void setName(String name) 
    {
        this.nombre = name;
    }    
}