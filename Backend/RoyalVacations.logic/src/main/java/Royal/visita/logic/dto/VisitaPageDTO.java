/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.visita.logic.dto;

import java.util.List;

/**
 *
 * @author estudiante
 */
public class VisitaPageDTO
{
     private Long totalRecords;

    private List<VisitaDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<VisitaDTO> getRecords() {
        return records;
    }

    public void setRecords(List<VisitaDTO> records) {
        this.records = records;
    }
}
