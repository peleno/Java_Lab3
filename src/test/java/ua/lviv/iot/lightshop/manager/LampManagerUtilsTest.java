package ua.lviv.iot.lightshop.manager;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.lightshop.model.SortType;

public class LampManagerUtilsTest extends BaseLampManagerTest {

	@Test
	public void testSortDescending() {
		LampManagerUtils.sortLampsByPrice(lamps, SortType.DESC);
		
	}
	
	@Test
	public void testSortEmptyList() {
		LampManagerUtils.sortLampsByPrice(null, SortType.DESC);
	}
}
