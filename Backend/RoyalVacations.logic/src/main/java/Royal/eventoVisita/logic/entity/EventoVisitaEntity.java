/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.eventoVisita.logic.entity;

import Royal.evento.logic.entity.EventoEntity;
import Royal.visita.logic.entity.VisitaEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author estudiante
 */

@Entity
public class EventoVisitaEntity 
{
    @Id
    @GeneratedValue(generator = "EventoVisita")
    
    private Long id;
    
    @ManyToOne
    private EventoEntity evento;
    
    @ManyToOne
    private VisitaEntity visita;
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EventoEntity getEvento() {
        return evento;
    }

    public void setEvento(EventoEntity evento) {
        this.evento = evento;
    }

    public VisitaEntity getVisita() {
        return visita;
    }

    public void setVisita(VisitaEntity visita) {
        this.visita = visita;
    }
}
