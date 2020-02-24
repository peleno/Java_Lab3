package ua.lviv.iot.lightshop.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.lightshop.model.AbstractLamp;
import ua.lviv.iot.lightshop.model.CeilingLamp;
import ua.lviv.iot.lightshop.model.RoomType;

public abstract class BaseLampManagerTest {

	protected List<AbstractLamp> lamps;
	
	@BeforeEach
	public void createTableLamps() {
		lamps = new LinkedList<AbstractLamp>();
		lamps.add(new CeilingLamp(RoomType.BATHROOM));
		lamps.add(new CeilingLamp(RoomType.BEDROOM));
		lamps.add(new CeilingLamp(RoomType.CHILDRENROOM));
		lamps.add(new CeilingLamp(RoomType.BEDROOM));
		lamps.add(new CeilingLamp(RoomType.KITCHEN));
		lamps.add(new CeilingLamp(RoomType.KITCHEN));
		lamps.add(new CeilingLamp(RoomType.KITCHEN));
	}
}
