package behavioral.mediator;

import behavioral.mediator.beans.Light;
import behavioral.mediator.beans.Mediator;
import behavioral.mediator.beans.commands.Command;
import behavioral.mediator.beans.commands.TurnOffAllLightsCommand;
import behavioral.mediator.beans.commands.TurnOnAllLightsCommand;

public class TestMediator {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light light1 = new Light("Bedroom");
        Light light2 = new Light("Bedroom2");

        mediator.registerLight(light1);
        mediator.registerLight(light2);

        Command turnOnAllLights = new TurnOnAllLightsCommand(mediator);
        Command turnOffAllLights = new TurnOffAllLightsCommand(mediator);

        turnOnAllLights.execute();
        turnOffAllLights.execute();


    }
}
