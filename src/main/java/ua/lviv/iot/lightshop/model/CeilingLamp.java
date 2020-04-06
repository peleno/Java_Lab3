package ua.lviv.iot.lightshop.model;

public class CeilingLamp extends AbstractLamp {
    private ShapeType shape;

    public CeilingLamp(String style, int countOfBulbs, String brand, double priceInUAH, RoomType room, int heightInMm,
            int widthInMm, ShapeType shape) {
        super(style, countOfBulbs, brand, priceInUAH, room, heightInMm, widthInMm);
        this.shape = shape;
    }

    public CeilingLamp(RoomType room) {
        super(room);
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "shape";
    }

    public String toCSV() {
        return super.toCSV() + "," + shape;
    }

    public ShapeType getShape() {
        return shape;
    }

    public void setShape(ShapeType shape) {
        this.shape = shape;
    }

}
