package ua.lviv.iot.lightshop.model;

public class LightBulb {

    private double powerInW;

    private double voltageInV;

    private String color;

    private BulbType type;

    public LightBulb() {

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
