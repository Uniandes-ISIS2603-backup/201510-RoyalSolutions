/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.pais.logic.dto;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author estudiante
 */
@XmlRootElement
public class PaisDTO
{
    
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
