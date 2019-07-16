package behavioral.state.beans.states;

import behavioral.state.beans.Fan;

public class FanMediumState extends State {

    private Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        fan.setState(fan.getFanHighState());
        System.out.println("Turning fan on to high");
    }

    @Override
    public String toString() {
        return "Fan is on medium";
    }
}
