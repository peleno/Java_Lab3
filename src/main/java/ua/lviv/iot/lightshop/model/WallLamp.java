package ua.lviv.iot.lightshop.model;

public class WallLamp extends AbstractLamp {
    private int depthInMm;

    private ShapeType shape;

    public WallLamp(String style, int countOfBulbs, String brand, double priceInUAH, RoomType room, int heightInMm,
            int widthInMm, int depthInMm, ShapeType shape) {
        super(style, countOfBulbs, brand, priceInUAH, room, heightInMm, widthInMm);
        this.depthInMm = depthInMm;
        this.shape = shape;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "depthInMm" + "," + "shape";
    }

    public String toCSV() {
        return super.toCSV() + "," + depthInMm + "," + shape;
    }

    public int getDepthInMm() {
        return depthInMm;
    }

    public void setDepthInMm(int depthInMm) {
        this.depthInMm = depthInMm;
    }

    public ShapeType getShape() {
        return shape;
    }

    public void setShape(ShapeType shape) {
        this.shape = shape;
    }

}