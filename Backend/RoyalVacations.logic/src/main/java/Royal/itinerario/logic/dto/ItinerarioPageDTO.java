package Royal.itinerario.logic.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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
