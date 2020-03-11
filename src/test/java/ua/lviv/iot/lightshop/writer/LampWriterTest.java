package ua.lviv.iot.lightshop.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.lightshop.manager.BaseLampManagerTest;
import ua.lviv.iot.lightshop.model.AbstractLamp;

class LampWriterTest extends BaseLampManagerTest {
    LampWriter lampWriter = new LampWriter();

    @Test
    void writeToFileTest() throws IOException {
        lampWriter.setTextWriter(new FileWriter("lampInfo.csv"));
        lampWriter.writeToFile(lamps);
    }

    @Test
    void stringWriterTest() throws IOException {
        String expectedInfo = "";
        lampWriter.setTextWriter(new StringWriter());
        lampWriter.writeToFile(lamps);
        for (AbstractLamp lamp : lamps) {
            expectedInfo += lamp.getHeaders() + "\n" + lamp.toCSV() + "\n";
        }
        assertEquals(expectedInfo, lampWriter.toString());
    }

}
