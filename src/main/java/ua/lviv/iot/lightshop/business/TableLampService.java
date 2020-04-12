package ua.lviv.iot.lightshop.business;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lightshop.dataaccess.TableLampRepository;
import ua.lviv.iot.lightshop.model.TableLamp;

@Service
public class TableLampService {

    @Autowired
    private TableLampRepository tableLampRepository;

    public TableLamp createLamp(TableLamp tableLamp) {
        return tableLampRepository.save(tableLamp);
    }

    public void deleteLamp(Integer lampId) {
        tableLampRepository.deleteById(lampId);
    }

    public TableLamp updateLamp(Integer lampId, TableLamp tableLamp) {
        tableLamp.setId(lampId);
        return tableLampRepository.save(tableLamp);
    }

    public boolean lampExists(Integer lampId) {
        return tableLampRepository.existsById(lampId);
    }

    public TableLamp findLampById(Integer lampId) {
        try {
            return tableLampRepository.findById(lampId).get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public List<TableLamp> findAll() {
        return tableLampRepository.findAll();
    }
}
