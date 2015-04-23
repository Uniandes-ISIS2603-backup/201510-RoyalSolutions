package Royal.ciudad.logic.entity;

import Royal.pais.logic.entity.PaisEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CiudadEntity {

    @Id
    @GeneratedValue(generator = "Ciudad")
    private Long id;
    private String name;
    private Integer population;
    @ManyToOne
    private PaisEntity country;

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

    public PaisEntity getCountry() {
        return country;
    }

    public void setCountry(PaisEntity country) {
        this.country = country;
    }
}
