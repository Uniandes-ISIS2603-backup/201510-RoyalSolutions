package Royal.ciudad.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CiudadPageDTO{

    private Long totalRecords;

    private List<CiudadDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<CiudadDTO> getRecords() {
        return records;
    }

    public void setRecords(List<CiudadDTO> records) {
        this.records = records;
    }
}
