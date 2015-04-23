package Royal.pais.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PaisPageDTO {
    private Long totalRecords;

    private List<PaisDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<PaisDTO> getRecords() {
        return records;
    }

    public void setRecords(List<PaisDTO> records) {
        this.records = records;
    }
}
