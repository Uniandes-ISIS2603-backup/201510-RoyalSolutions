/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.pais.logic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author estudiante
 */
public class PaisEntity 
{
     @Id
    @GeneratedValue(generator = "Pais")
     
     private String nombre;
 private int poblacion;
     
    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }
    
    public int getPopulation() {
        return poblacion;
    }

    public void setPopulation(int population) {
        this.poblacion = population;
    }  
}
