package ua.lviv.iot.lightshop.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.lightshop.model.AbstractLamp;

public class LampWriter {
    private Writer textWriter;

    public Writer getTextWriter() {
        return textWriter;
    }

    public void setTextWriter(Writer textWriter) {
        this.textWriter = textWriter;
    }

    public void writeToFile(List<AbstractLamp> lamps) throws IOException {
        for (AbstractLamp lamp : lamps) {
            textWriter.write(lamp.getHeaders() + "\n" + lamp.toCSV() + "\n");
        }
        textWriter.flush();
    }

    @Override
    public String toString() {
        return textWriter.toString();
    }

}
