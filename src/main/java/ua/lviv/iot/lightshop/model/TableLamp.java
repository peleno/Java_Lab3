package ua.lviv.iot.lightshop.model;

import javax.persistence.Entity;

@Entity
public class TableLamp extends AbstractLamp {

    private TableLampType type;

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
}
