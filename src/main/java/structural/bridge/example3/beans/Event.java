package structural.bridge.example3.beans;

import java.time.LocalDateTime;

public class Event {

    private String title;
    private LocalDateTime dateTime;
    private String location;

    public Event() {
    }

    public Event(String title, LocalDateTime dateTime, String location) {
        this.title = title;
        this.dateTime = dateTime;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
