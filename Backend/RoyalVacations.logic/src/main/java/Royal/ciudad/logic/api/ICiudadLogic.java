package Royal.ciudad.logic.api;

import Royal.ciudad.logic.dto.CiudadDTO;
import Royal.ciudad.logic.dto.CiudadPageDTO;
import java.util.List;

public interface ICiudadLogic {

    public CiudadDTO createCiudad(CiudadDTO detail);

    public List<CiudadDTO> getCiudades();

    public CiudadPageDTO getCiudades(Integer page, Integer maxRecords);

    public CiudadDTO getCiudad(Long id);

    public void deleteCiudad(Long id);

    public void updateCiudad(CiudadDTO detail);
}