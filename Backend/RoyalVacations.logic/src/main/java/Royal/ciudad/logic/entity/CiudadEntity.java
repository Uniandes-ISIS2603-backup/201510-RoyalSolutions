/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.ciudad.logic.entity;

import Royal.pais.logic.entity.PaisEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author estudiante
 */
@Entity
public class CiudadEntity
{
    
   
    
    @Id
    @GeneratedValue(generator = "Ciudad")
    @Column(name = "CIUDAD_ID")
    private long id;
    private String nombre;
    
  
    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }
    
  
    
    public Long getId() {
        return id;
    }

    public void setId(Long pid) {
        this.id = pid;
    }
}
