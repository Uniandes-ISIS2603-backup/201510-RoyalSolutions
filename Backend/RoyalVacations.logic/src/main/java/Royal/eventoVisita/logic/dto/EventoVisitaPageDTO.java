/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.eventoVisita.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author estudiante
 */

@XmlRootElement
public class EventoVisitaPageDTO 
{
     private Long totalRecords;

    private List<EventoVisitaDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<EventoVisitaDTO> getRecords() {
        return records;
    }

    public void setRecords(List<EventoVisitaDTO> records) {
        this.records = records;
    }
}