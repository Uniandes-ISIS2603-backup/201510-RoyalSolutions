package Royal.login.logic.dto;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author estudiante
 */

@XmlRootElement
public class LoginPageDTO 
{
    private Long totalRecords;

    private List<LoginDTO> records;

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<LoginDTO> getRecords() {
        return records;
    }

    public void setRecords(List<LoginDTO> records) {
        this.records = records;
    }
}
