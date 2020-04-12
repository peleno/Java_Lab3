package ua.lviv.iot.lightshop.business;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lightshop.dataaccess.LightBulbRepository;
import ua.lviv.iot.lightshop.model.LightBulb;

@Service
public class LightBulbService {

    @Autowired
    private LightBulbRepository lightBulbRepository;

    public List<LightBulb> getAllBulbs() {
        return lightBulbRepository.findAll();
    }

    public LightBulb getBulbById(Integer bulbId) {
        try {
            return lightBulbRepository.findById(bulbId).get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public LightBulb createBulb(LightBulb bulb) {
        return lightBulbRepository.save(bulb);
    }

    public LightBulb updateBulb(Integer bulbId, LightBulb bulb) {
        bulb.setId(bulbId);
        return lightBulbRepository.save(bulb);
    }

    public void deleteBulb(Integer bulbId) {
        lightBulbRepository.deleteById(bulbId);
    }

    public boolean bulbExists(Integer bulbId) {
        return lightBulbRepository.existsById(bulbId);
    }
}
