package SouvenirsProject.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "producers")
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "producer_brand")
    private String producer;

    @Column(name = "country")
    private Country country;

    @OneToMany(mappedBy = "producer")
    private List<Souvenir> souvenirsList;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public List<Souvenir> getSouvenirsList() {
        return souvenirsList;
    }

    public void setSouvenirsList(List<Souvenir> souvenirsList) {
        this.souvenirsList = souvenirsList;
    }
}
