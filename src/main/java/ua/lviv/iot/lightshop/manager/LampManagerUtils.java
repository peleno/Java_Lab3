package ua.lviv.iot.lightshop.manager;

import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.lightshop.model.AbstractLamp;
import ua.lviv.iot.lightshop.model.SortType;

public class LampManagerUtils {

    class LampsSorterByPriceInUAH implements Comparator<AbstractLamp> {

        @Override
        public int compare(AbstractLamp firstLamp, AbstractLamp secondLamp) {
            return Double.compare(firstLamp.getPriceInUAH(), secondLamp.getPriceInUAH());
        }
    }

    static class LampsSorterByCountOfBulbs implements Comparator<AbstractLamp> {

        @Override
        public int compare(AbstractLamp firstLamp, AbstractLamp secondLamp) {
            return firstLamp.getCountOfBulbs() - secondLamp.getCountOfBulbs();
        }

    }

    private static final LampsSorterByCountOfBulbs LAMPS_SORTER_BY_COUNT_OF_BULBS = new LampsSorterByCountOfBulbs();

    // sort using inner class
    public static void sortLampsByPrice(List<AbstractLamp> lamps, SortType sortType) {
        LampsSorterByPriceInUAH comparator = new LampManagerUtils().new LampsSorterByPriceInUAH();
        lamps.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }

    // sort using static inner class
    public static void sortLampsByCountOfBulbs(List<AbstractLamp> lamps, SortType sortType) {
        lamps.sort(
                sortType == SortType.ASCENDING ? LAMPS_SORTER_BY_COUNT_OF_BULBS : LAMPS_SORTER_BY_COUNT_OF_BULBS.reversed());
    }

    // sort using anonymous class
    public static void sortLampsByStyle(List<AbstractLamp> lamps, SortType sortType) {
        Comparator<AbstractLamp> comparator = new Comparator<AbstractLamp>() {

            @Override
            public int compare(AbstractLamp firstLamp, AbstractLamp secondLamp) {
                return firstLamp.getStyle().compareTo(secondLamp.getStyle());
            }
        };
        lamps.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }

    // sort using lambda
    public static void sortLampsByRoom(List<AbstractLamp> lamps, SortType sortType) {
        Comparator<AbstractLamp> comparator = (AbstractLamp firstLamp, AbstractLamp secondLamp) -> {
            return firstLamp.getRoom().ordinal() - secondLamp.getRoom().ordinal();
        };
        lamps.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }
}
