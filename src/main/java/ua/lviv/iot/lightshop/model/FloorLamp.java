package ua.lviv.iot.lightshop.model;

import java.util.List;

public class FloorLamp extends AbstractLamp {
    private RackType rack;

    public FloorLamp(String style, int countOfBulbs, List<LightBulb> bulbs, String brand, double priceInUAH,
            RoomType room, int heightInMm, int widthInMm, RackType rack) {
        super(style, countOfBulbs, bulbs, brand, priceInUAH, room, heightInMm, widthInMm);
        this.rack = rack;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "rack";
    }

    public String toCSV() {
        return super.toCSV() + "," + rack;
    }

    public RackType getRack() {
        return rack;
    }

    public void setRack(RackType rack) {
        this.rack = rack;
    }

}
