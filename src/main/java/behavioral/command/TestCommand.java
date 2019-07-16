package behavioral.command;

import behavioral.command.beans.*;

import java.util.Arrays;
import java.util.List;

public class TestCommand {
    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command toggle = new ToggleCommand(light);

        lightSwitch.storeAndExecute(toggle);
        lightSwitch.storeAndExecute(toggle);
        lightSwitch.storeAndExecute(toggle);

        Light bedroogLight = new Light();
        Light kitchenLight = new Light();
        Light roomLight = new Light();

        Command allLightsCommandCommand = new AllLightsCommandCommand(
                bedroogLight,
                kitchenLight,
                roomLight,
                light
        );

        lightSwitch.storeAndExecute(allLightsCommandCommand);
    }
}
