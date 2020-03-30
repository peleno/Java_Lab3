package ua.lviv.iot.lightshop.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.lightshop.model.TableLamp;

@RequestMapping("/lamps")
@RestController
public class TableLampController {
    private Map<Integer, TableLamp> lamps = new HashMap<Integer, TableLamp>();

    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<TableLamp> getLamps() {
        return new LinkedList<TableLamp>(lamps.values());
    }

    @GetMapping(path = "/{id}")
    public TableLamp getLamp(final @PathVariable("id") Integer lampId) {
        // to do : check if id exists
        return lamps.get(lampId);
    }

    @PostMapping
    public TableLamp createLamp(final @RequestBody TableLamp lamp) {
        lamp.setId(idCounter.incrementAndGet());
        lamps.put(lamp.getId(), lamp);
        return lamp;
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<TableLamp> updateLamp(final @PathVariable("id") Integer lampId,
            final @RequestBody TableLamp lamp) {
        if (lamps.containsKey(lampId)) {
            lamp.setId(lampId);
            lamps.put(lampId, lamp);
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<TableLamp> deleteLamp(final @PathVariable("id") Integer lampId) {
        if (lamps.containsKey(lampId)) {
            lamps.remove(lampId);
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
