/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.visita.logic.api;

import Royal.visita.logic.dto.VisitaDTO;
import Royal.visita.logic.dto.VisitaPageDTO;
import java.util.List;

/**
 *
 * @author estudiante
 */
public interface IVisitaLogic 
{
    public VisitaDTO createVisita(VisitaDTO detail);

    public List<VisitaDTO> getVisitas();

    public VisitaPageDTO getVisitas(Integer page, Integer maxRecords);

    public VisitaDTO getVisita(Long id);

    public void deleteVisita(Long id);

    public void updateVisita(VisitaDTO detail);
}
