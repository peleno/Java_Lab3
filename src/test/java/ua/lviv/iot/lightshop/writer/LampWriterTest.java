package ua.lviv.iot.lightshop.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.lightshop.manager.BaseLampManagerTest;
import ua.lviv.iot.lightshop.model.AbstractLamp;

class LampWriterTest extends BaseLampManagerTest {
    LampWriter lampWriter = new LampWriter();

    @Test
    void writeToFileTest() throws IOException {
        try (Writer writer = new FileWriter("lampInfo.csv")) {
            lampWriter.setTextWriter(writer);
            lampWriter.writeToFile(lamps);
        } catch (IOException e) {

        }
    }

    @Test
    void stringWriterTest() throws IOException {
        String expectedInfo = "";
        try (Writer writer = new StringWriter()) {
            lampWriter.setTextWriter(writer);
            lampWriter.writeToFile(lamps);
            for (AbstractLamp lamp : lamps) {
                expectedInfo += lamp.getHeaders() + "\n" + lamp.toCSV() + "\n";
            }
        } catch (IOException e) {

        }
        assertEquals(expectedInfo, lampWriter.toString());
    }

}
