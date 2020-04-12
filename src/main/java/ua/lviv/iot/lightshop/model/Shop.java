package ua.lviv.iot.lightshop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TableLamp_Shop", joinColumns = {
            @JoinColumn(name = "shop_id", nullable = false) }, inverseJoinColumns = {
                    @JoinColumn(name = "table_lamp_id", nullable = false) })
    @JsonIgnoreProperties("shops")
    private Set<TableLamp> tableLamps;

    public Shop() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TableLamp> getTableLamps() {
        return tableLamps;
    }

    public void setTableLamps(Set<TableLamp> tableLamps) {
        this.tableLamps = tableLamps;
    }

}
