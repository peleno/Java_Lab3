package ua.lviv.iot.lightshop.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.lightshop.model.AbstractLamp;
import ua.lviv.iot.lightshop.model.RoomType;

public class LampManager {

    private List<AbstractLamp> lamps = new LinkedList<>();

    public void addLamps(List<AbstractLamp> lamps) {
        this.lamps.addAll(lamps);
    }

    public void addLamp(AbstractLamp lamp) {
        this.lamps.add(lamp);
    }

    public List<AbstractLamp> findBy(RoomType room) {

        List<AbstractLamp> result = new LinkedList<AbstractLamp>();

        for (AbstractLamp lamp : lamps) {
            if (lamp.getRoom() == room) {
                result.add(lamp);
            }
        }

        return result;
    }

}
