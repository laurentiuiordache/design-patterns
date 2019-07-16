package behavioral.command.beans;

import java.util.Arrays;
import java.util.List;

public class AllLightsCommandCommand implements Command{
    List<Light> lights;

    public AllLightsCommandCommand(List<Light> lights) {
        this.lights = lights;
    }

    public AllLightsCommandCommand(Light... lights) {
        this.lights = Arrays.asList(lights);
    }

    @Override
    public void execute() {
        lights.stream().forEach(light -> {
            if(light.isOn()){
                light.toggle();
            }
        });
    }
}
