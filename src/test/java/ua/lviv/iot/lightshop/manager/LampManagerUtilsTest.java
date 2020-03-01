package ua.lviv.iot.lightshop.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.lightshop.model.RoomType;
import ua.lviv.iot.lightshop.model.SortType;

public class LampManagerUtilsTest extends BaseLampManagerTest {

    @Test
    public void testSortByRoomDescending() {
        LampManagerUtils.sortLampsByRoom(lamps, SortType.DESCENDING);
        assertEquals(RoomType.OFFICE, lamps.get(0).getRoom());
        assertEquals(RoomType.CHILDRENROOM, lamps.get(1).getRoom());
        assertEquals(RoomType.CORRIDOR, lamps.get(2).getRoom());
        assertEquals(RoomType.LIVINGROOM, lamps.get(3).getRoom());
        assertEquals(RoomType.KITCHEN, lamps.get(4).getRoom());
        assertEquals(RoomType.BATHROOM, lamps.get(5).getRoom());
        assertEquals(RoomType.BEDROOM, lamps.get(6).getRoom());
        assertEquals(RoomType.BEDROOM, lamps.get(7).getRoom());
    }
    
    @Test
    public void testSortByPriceInAscending() {
        LampManagerUtils.sortLampsByPrice(lamps, SortType.ASCENDING);
        assertEquals(539, lamps.get(0).getPriceInUAH());
        assertEquals(799, lamps.get(1).getPriceInUAH());
        assertEquals(1069, lamps.get(2).getPriceInUAH());
        assertEquals(1191, lamps.get(3).getPriceInUAH());
        assertEquals(1459, lamps.get(4).getPriceInUAH());
        assertEquals(2701, lamps.get(5).getPriceInUAH());
        assertEquals(3039, lamps.get(6).getPriceInUAH());
        assertEquals(5452, lamps.get(7).getPriceInUAH());
    }

    @Test
    public void testSortByCountOfBulbsDescending() {
        LampManagerUtils.sortLampsByCountOfBulbs(lamps, SortType.DESCENDING);
        assertEquals(4, lamps.get(0).getCountOfBulbs());
        assertEquals(3, lamps.get(1).getCountOfBulbs());
        assertEquals(2, lamps.get(2).getCountOfBulbs());
        assertEquals(2, lamps.get(3).getCountOfBulbs());
        assertEquals(2, lamps.get(4).getCountOfBulbs());
        assertEquals(1, lamps.get(5).getCountOfBulbs());
        assertEquals(1, lamps.get(6).getCountOfBulbs());
        assertEquals(1, lamps.get(7).getCountOfBulbs());
    }
    
    @Test
    public void testSortByStyleAscending() {
        LampManagerUtils.sortLampsByStyle(lamps, SortType.ASCENDING);
        assertEquals("Classic", lamps.get(0).getStyle());
        assertEquals("Classic", lamps.get(1).getStyle());
        assertEquals("Country", lamps.get(2).getStyle());
        assertEquals("Luxury", lamps.get(3).getStyle());
        assertEquals("Minimal", lamps.get(4).getStyle());
        assertEquals("Modern", lamps.get(5).getStyle());
        assertEquals("Modern", lamps.get(6).getStyle());
        assertEquals("Office", lamps.get(7).getStyle());

    }
    /*
     * @Test public void testSortEmptyList() {
     * LampManagerUtils.sortLampsByPrice(null, SortType.DESCENDING); }
     */
}
