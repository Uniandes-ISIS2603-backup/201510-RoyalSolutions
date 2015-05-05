/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.visita.logic.entity;

import Royal.ciudad.logic.entity.CiudadEntity;
import Royal.itinerario.logic.entity.ItinerarioEntity;
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
public class VisitaEntity 
{
    @Id
    @GeneratedValue(generator = "Visita")
    private Long id;
    private Date inicio; 
    private Date fin;
    @ManyToOne
    private CiudadEntity ciudad;
    private ItinerarioEntity itinerario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public CiudadEntity getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadEntity ciudad) {
        this.ciudad = ciudad;
    }
    
    public ItinerarioEntity getItinerario() {
        return itinerario;
    }

    public void setItinerario(ItinerarioEntity itinerario) {
        this.itinerario = itinerario;
    }
}
