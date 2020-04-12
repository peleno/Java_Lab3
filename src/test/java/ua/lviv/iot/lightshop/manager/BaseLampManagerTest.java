package ua.lviv.iot.lightshop.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.lightshop.model.AbstractLamp;
import ua.lviv.iot.lightshop.model.CeilingLamp;
import ua.lviv.iot.lightshop.model.FloorLamp;
import ua.lviv.iot.lightshop.model.RackType;
import ua.lviv.iot.lightshop.model.RoomType;
import ua.lviv.iot.lightshop.model.ShapeType;
import ua.lviv.iot.lightshop.model.TableLamp;
import ua.lviv.iot.lightshop.model.TableLampType;
import ua.lviv.iot.lightshop.model.WallLamp;

public abstract class BaseLampManagerTest {

    protected List<AbstractLamp> lamps;

    @BeforeEach
    public void createTableLamps() {
        lamps = new LinkedList<AbstractLamp>();
        lamps.add(new CeilingLamp("Classic", 4, "Artemide", 2701, RoomType.LIVINGROOM, 85, 290, ShapeType.SPHERE));
        lamps.add(new CeilingLamp("Modern", 2, "Artempo", 1069, RoomType.KITCHEN, 150, 370, ShapeType.CIRCLE));
        lamps.add(new FloorLamp("Country", 1, "Fabbian", 539, RoomType.CHILDRENROOM, 1510, 380, RackType.ARC));
        lamps.add(new FloorLamp("Modern", 2, "Emporium", 799, RoomType.CORRIDOR, 1650, 380, RackType.UNUSUAL));
        lamps.add(new TableLamp("Classic", 1, "Lampex", 1459, RoomType.BEDROOM, 440, 180, TableLampType.BEDSIDE));
        lamps.add(new TableLamp("Office", 1, "Lis", 1191, RoomType.OFFICE, 300, 100, TableLampType.TASK));
        lamps.add(new WallLamp("Minimal", 2, "Nordlux", 3039, RoomType.BATHROOM, 120, 120, 120, ShapeType.SQUARE));
        lamps.add(new WallLamp("Luxury", 3, "Vistosi", 5452, RoomType.BEDROOM, 320, 205, 205, ShapeType.SPHERE));
    }
}
