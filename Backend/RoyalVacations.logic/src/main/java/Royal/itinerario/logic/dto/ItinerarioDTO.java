/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Royal.itinerario.logic.dto;
import java.sql.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author estudiante
 */
@XmlRootElement
public class ItinerarioDTO 
{
    private Long id;
    private String name;
    private Date inicio;
    private Date fin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date pInicio) {
        this.inicio = pInicio;
    }
    
    public Date getFin() {
        return fin;
    }

    public void setFin(Date pFin) {
        this.fin = pFin;
    }
}  