/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.pais.logic.dto;

import Royal.ciudad.logic.dto.CiudadDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author estudiante
 */
@XmlRootElement
public class CiudadPageDTO {
    
    private Long totalCiudaes;
    private List<CiudadDTO> ciudades;

    public void setTotalCiudades(Long totalCiudaes) {
        this.totalCiudaes = totalCiudaes;
    }

    public void setCiudades(List<CiudadDTO> ciudades) {
        this.ciudades = ciudades;
    }

    public Long getTotalCiudaes() {
        return totalCiudaes;
    }

    public List<CiudadDTO> getCiudades() {
        return ciudades;
    }
    
    
    
}
