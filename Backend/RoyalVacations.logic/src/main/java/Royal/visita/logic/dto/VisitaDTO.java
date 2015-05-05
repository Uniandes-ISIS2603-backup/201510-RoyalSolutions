/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.visita.logic.dto;

import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author estudiante
 */

@XmlRootElement
public class VisitaDTO {
    private Long id;

    private Date inicio;
    
    private Date fin;
    
    private Long ciudad;
    
    private Long itinerario;

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

    public Long getCiudad() {
        return ciudad;
    }

    public void setCiudad(Long ciudad) {
        this.ciudad = ciudad;
    }
    
    public Long getItinerario() {
        return itinerario;
    }

    public void setItinerario(Long itinerario) {
        this.itinerario = itinerario;
    }
}
