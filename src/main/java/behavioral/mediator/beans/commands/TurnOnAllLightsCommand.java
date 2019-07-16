package behavioral.mediator.beans.commands;

import behavioral.mediator.beans.Mediator;

public class TurnOnAllLightsCommand implements Command{

    private Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        this.mediator.turOnAllLights();
    }
}
