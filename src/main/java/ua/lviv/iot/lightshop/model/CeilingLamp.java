package ua.lviv.iot.lightshop.model;

import java.util.List;

public class CeilingLamp extends AbstractLamp {
    private ShapeType shape;
    
    public CeilingLamp(String style, int countOfBulbs, List<LightBulb> bulbs, String brand, double priceInUAH,
            RoomType room, int heightInMm, int widthInMm, ShapeType shape) {
        super(style, countOfBulbs, bulbs, brand, priceInUAH, room, heightInMm, widthInMm);
        this.shape = shape;
    }

    public CeilingLamp(RoomType room) {
        super(room);
    }

    public ShapeType getShape() {
        return shape;
    }

    public void setShape(ShapeType shape) {
        this.shape = shape;
    }

}
