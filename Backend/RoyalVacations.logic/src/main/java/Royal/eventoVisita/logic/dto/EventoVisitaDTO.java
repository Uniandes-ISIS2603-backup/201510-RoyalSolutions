/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.eventoVisita.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author estudiante
 */

@XmlRootElement
public class EventoVisitaDTO
{
    private Long evento;
    
    private Long visita;

    public Long getEvento() {
        return evento;
    }

    public void setEvento(Long evento) {
        this.evento = evento;
    }

    public Long getVisita() {
        return visita;
    }

    public void setVisita(Long visita) {
        this.visita = visita;
    }
}