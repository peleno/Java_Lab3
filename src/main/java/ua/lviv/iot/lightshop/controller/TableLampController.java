package ua.lviv.iot.lightshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
import ua.lviv.iot.lightshop.business.TableLampService;
import ua.lviv.iot.lightshop.model.TableLamp;

@RequestMapping("/lamps")
@RestController
public class TableLampController {

    @Autowired
    private TableLampService tableLampService;

    @GetMapping
    public List<TableLamp> getLamps() {
        return tableLampService.findAll();
    }

    @GetMapping(path = "/{id}")
    public TableLamp getLamp(final @PathVariable("id") Integer lampId) {
        return tableLampService.findLampById(lampId);
    }

    @PostMapping
    public TableLamp createLamp(final @RequestBody TableLamp lamp) {
        return tableLampService.createLamp(lamp);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<TableLamp> updateLamp(final @PathVariable("id") Integer lampId,
            final @RequestBody TableLamp lamp) {
        TableLamp previousLamp = tableLampService.findLampById(lampId);
        if (previousLamp != null) {
            tableLampService.updateLamp(lampId, lamp);
            return ResponseEntity.ok(previousLamp);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<TableLamp> deleteLamp(final @PathVariable("id") Integer lampId) {
        if (tableLampService.lampExists(lampId)) {
            tableLampService.deleteLamp(lampId);
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
