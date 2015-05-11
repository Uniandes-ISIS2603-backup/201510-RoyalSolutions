/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.eventoVisita.logic.entity;

import Royal.evento.logic.entity.EventoEntity;
import Royal.visita.logic.entity.VisitaEntity;
import javax.persistence.Entity;

/**
 *
 * @author estudiante
 */

@Entity
public class EventoVisitaEntity 
{
    private EventoEntity evento;
    
    private VisitaEntity visita;

    public EventoEntity getEvento() {
        return evento;
    }

    public void setEvento(EventoEntity evento) {
        this.evento = evento;
    }

    public VisitaEntity getVisita() {
        return visita;
    }

    public void setName(VisitaEntity visita) {
        this.visita = visita;
    }
}
