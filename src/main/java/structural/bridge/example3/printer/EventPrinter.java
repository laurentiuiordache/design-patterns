package structural.bridge.example3.printer;

import structural.bridge.example3.beans.Detail;
import structural.bridge.example3.beans.Event;

import java.util.Arrays;
import java.util.List;

public class EventPrinter extends Printer {
    Event event;

    public EventPrinter(Event event) {
        this.event = event;
    }

    @Override
    public String getHeader() {
        return event.getTitle();
    }

    @Override
    public List<Detail> getDetails() {
        return Arrays.asList(
                new Detail("Date: ", event.getDateTime().toLocalDate().toString()),
                new Detail("Hour: ", event.getDateTime().toLocalTime().toString()),
                new Detail("Location:", event.getLocation())
        );
    }
}
