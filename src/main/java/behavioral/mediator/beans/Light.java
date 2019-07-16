package behavioral.mediator.beans;

public class Light {
    private boolean isOn = false;

    private String location = "";

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
        isOn = !isOn;
    }

    public void on() {
        System.out.println("Light switched on.");
    }

    public void off() {
        System.out.println("Light switched off.");
    }
}
