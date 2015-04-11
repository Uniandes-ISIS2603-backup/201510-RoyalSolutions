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
public class PaisEntity 
{
    
    @GeneratedValue(generator = "Pais")
     
     
     @Id
    @Column (name = "PAIS_ID")
     private Long id;
    
     private String nombre;
    private int poblacion;
    @OneToMany(mappedBy="pais")
    private List<CiudadEntity> ciudades;
    
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
    
    public List getCiudades()
    {
        return ciudades;
    }
    
    public void addCiudad(CiudadEntity ciud)
    {
        ciudades.add(ciud);
    }
    
    public void deleteCiudad(String nombre)
    {
        for (int i = 0; i<ciudades.size(); i++)
        {
            if( ((CiudadEntity) ciudades.get(i)).getName() == nombre)
            {
                ciudades.remove(i);
            }
        }
    }
}
