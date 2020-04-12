package ua.lviv.iot.lightshop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LightBulb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private double powerInW;

    private double voltageInV;

    private String color;

    private BulbType type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "table_lamp_id")
    @JsonIgnoreProperties("lightBulbs")
    private TableLamp tableLamp;

    public LightBulb() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TableLamp getTableLamp() {
        return tableLamp;
    }

    public void setTableLamp(TableLamp tableLamp) {
        this.tableLamp = tableLamp;
    }

    public double getPowerInW() {
        return powerInW;
    }

    public void setPowerInW(double powerInW) {
        this.powerInW = powerInW;
    }

    public double getVoltageInV() {
        return voltageInV;
    }

    public void setVoltageInV(double voltageInV) {
        this.voltageInV = voltageInV;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BulbType getType() {
        return type;
    }

    public void setType(BulbType type) {
        this.type = type;
    }

}
