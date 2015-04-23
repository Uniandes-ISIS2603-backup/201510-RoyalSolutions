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

    public PaisDTO createCountry(PaisDTO detail);

    public List<PaisDTO> getCountries();

    public PaisPageDTO getCountries(Integer page, Integer maxRecords);

    public PaisDTO getCountry(Long id);

    public void deleteCountry(Long id);

    public void updateCountry(PaisDTO detail);
    
    public PaisDTO getMostPopulated();
    
    public PaisDTO getLeastPopulated();
}
