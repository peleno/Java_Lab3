package ua.lviv.iot.lightshop.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lightshop.model.AbstractLamp;
import ua.lviv.iot.lightshop.model.RoomType;
import ua.lviv.iot.lightshop.manager.LampManager;

class LampManagerTest extends BaseLampManagerTest {

    private LampManager lampManager;

    @BeforeEach
    public void setUp() {
        lampManager = new LampManager();
        lampManager.addLamps(lamps);
    }

    @Test
    public void testFindByRoom() {
        List<AbstractLamp> kitchenLamps = lampManager.findBy(RoomType.KITCHEN);
        List<AbstractLamp> bedroomLamps = lampManager.findBy(RoomType.BEDROOM);
        List<AbstractLamp> bathroomLamps = lampManager.findBy(RoomType.BATHROOM);
        List<AbstractLamp> corridorLamps = lampManager.findBy(RoomType.CORRIDOR);
        assertEquals(1, kitchenLamps.size());
        assertEquals(2, bedroomLamps.size());
        assertEquals(1, bathroomLamps.size());
        assertEquals(1, corridorLamps.size());
        assertEquals(1, lampManager.findBy(RoomType.CHILDRENROOM).size());
        assertEquals(1, lampManager.findBy(RoomType.LIVINGROOM).size());
        assertEquals(1, lampManager.findBy(RoomType.OFFICE).size());
    }

}
