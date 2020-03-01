package ua.lviv.iot.lightshop.model;

import java.util.List;

public class TableLamp extends AbstractLamp {

    private TableLampType type;
    
    public TableLamp(String style, int countOfBulbs, List<LightBulb> bulbs, String brand, double priceInUAH,
            RoomType room, int heightInMm, int widthInMm, TableLampType type) {
        super(style, countOfBulbs, bulbs, brand, priceInUAH, room, heightInMm, widthInMm);
        this.type = type;
    }

    public TableLamp(double price) {
        super(price);

    }

    public TableLampType getType() {
        return type;
    }

    public void setType(TableLampType type) {
        this.type = type;
    }

}
