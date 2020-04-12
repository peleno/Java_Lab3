package ua.lviv.iot.lightshop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class TableLamp extends AbstractLamp {

    private TableLampType type;

    @OneToMany(mappedBy = "tableLamp", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("tableLamp")
    private Set<LightBulb> lightBulbs;

    @JsonIgnoreProperties("tableLamps")
    @JoinTable(name = "TableLamp_Shop", joinColumns = {
            @JoinColumn(name = "table_lamp_id", nullable = false) }, inverseJoinColumns = {
                    @JoinColumn(name = "shop_id", nullable = true) })
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Shop> shops;

    public TableLamp(String style, int countOfBulbs, String brand, double priceInUAH, RoomType room, int heightInMm,
            int widthInMm, TableLampType type) {
        super(style, countOfBulbs, brand, priceInUAH, room, heightInMm, widthInMm);
        this.type = type;
    }

    public TableLamp(double price) {
        super(price);
    }

    public TableLamp() {
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "type";
    }

    public String toCSV() {
        return super.toCSV() + "," + type;
    }

    public TableLampType getType() {
        return type;
    }

    public void setType(TableLampType type) {
        this.type = type;
    }

    public Set<LightBulb> getLightBulbs() {
        return lightBulbs;
    }

    public void setLightBulbs(Set<LightBulb> lightBulbs) {
        this.lightBulbs = lightBulbs;
    }

    public Set<Shop> getShops() {
        return shops;
    }

    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }
}
