package ua.lviv.iot.lightshop.model;

public class FloorLamp extends AbstractLamp {
    private RackType rack;

    public FloorLamp(String style, int countOfBulbs, String brand, double priceInUAH, RoomType room, int heightInMm,
            int widthInMm, RackType rack) {
        super(style, countOfBulbs, brand, priceInUAH, room, heightInMm, widthInMm);
        this.rack = rack;
    }

    public FloorLamp() {
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
