/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.itinerario.logic.dto;

import java.util.List;

/**
 *
 * @author estudiante
 */
public class ItinerarioPageDTO 
{
    private Long totalRecords;

    private List<ItinerarioDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<ItinerarioDTO> getRecords() {
        return records;
    }

    public void setRecords(List<ItinerarioDTO> records) {
        this.records = records;
    }
}
