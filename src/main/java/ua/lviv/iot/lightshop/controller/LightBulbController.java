package ua.lviv.iot.lightshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.lightshop.business.LightBulbService;
import ua.lviv.iot.lightshop.model.LightBulb;

@RequestMapping(path = "/bulbs")
@RestController
public class LightBulbController {

    @Autowired
    private LightBulbService lightBulbService;

    @GetMapping
    public List<LightBulb> getAllBulbs() {
        return lightBulbService.getAllBulbs();
    }

    @GetMapping(path = "/{id}")
    public LightBulb getBulb(Integer bulbId) {
        return lightBulbService.getBulbById(bulbId);
    }

    @PostMapping
    public LightBulb createBulb(final @RequestBody LightBulb bulb) {
        return lightBulbService.createBulb(bulb);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<LightBulb> updateBulb(final @PathVariable("id") Integer bulbId,
            final @RequestBody LightBulb bulb) {
        LightBulb previousBulb = lightBulbService.getBulbById(bulbId);
        if (previousBulb != null) {
            lightBulbService.updateBulb(bulbId, bulb);
            return ResponseEntity.ok(previousBulb);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<LightBulb> deleteBulb(final @PathVariable("id") Integer bulbId) {
        if (lightBulbService.bulbExists(bulbId)) {
            lightBulbService.deleteBulb(bulbId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
