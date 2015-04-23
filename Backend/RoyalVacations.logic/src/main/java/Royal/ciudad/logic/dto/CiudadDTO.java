package Royal.ciudad.logic.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CiudadDTO {

    private Long id;

    private String name;

    private Integer population;
    
    private Long country;

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

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer pPopulation) {
        this.population = pPopulation;
    }

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }
}
