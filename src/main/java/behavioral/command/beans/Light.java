package behavioral.command.beans;

// receiver
public class Light {
    private boolean isOn = false;

    public void on() {
        System.out.println("Light switched on.");
    }

    public void off() {
        System.out.println("Light switched off.");
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}
