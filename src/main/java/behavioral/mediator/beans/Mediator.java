package behavioral.mediator.beans;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turOnAllLights() {
        lights.stream().forEach(l -> {
            if (!l.isOn()) l.toggle();
        });
    }

    public void turnOffAllLights() {
        lights.stream().forEach(l -> {
            if (l.isOn()) l.toggle();
        });
    }
}
