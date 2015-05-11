/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.itinerario.logic.entity;

import Royal.login.logic.entity.LoginEntity;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author estudiante
 */
@Entity
public class ItinerarioEntity 
{
    @Id
    @GeneratedValue(generator = "Itinerario")
    private Long id;
    private String name;
    private Date inicio;
    private Date fin;
    @ManyToOne
    private LoginEntity usuario;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date pInicio) {
        this.inicio = pInicio;
    }
    
    public Date getFin() {
        return fin;
    }

    public void setFin(Date pFin) {
        this.fin = pFin;
    }
    
    public LoginEntity getUsuario()
    {
        return usuario;
    }
    
    public void setUsuario(LoginEntity usuario)
    {
        this.usuario = usuario;
    }
}