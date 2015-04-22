/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.pais.logic.entity;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import Royal.ciudad.logic.entity.CiudadEntity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.OneToMany;

/**
 *
 * @author estudiante
 */
@Entity
public class PaisEntity 
{
    
    
     
     
    @Id
    @GeneratedValue(generator = "Pais")
    @Column (name = "PAIS_ID")
     private Long id;
    
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
     public Long getId() {
        return id;
    }

    public void setId(Long pid) {
        this.id = pid;
    }
    
   
}
