/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.pais.logic.api;

import Royal.pais.logic.dto.PaisDTO;
import Royal.pais.logic.dto.PaisPageDTO;
import java.util.List;

/**
 *
 * @author afesguerra
 */
public interface IPaisLogic {

    public PaisDTO createPais(PaisDTO detail);

    public List<PaisDTO> getPaises();

    public PaisPageDTO getPaises(Integer page, Integer maxRecords);

    public PaisDTO getPais(Long id);

    public void deletePais(Long id);

    public void updatePais(PaisDTO detail);
    
    public PaisDTO getMostPopulated();
    
    public PaisDTO getLeastPopulated();
}
