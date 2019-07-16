package behavioral.state.beans.states;

import behavioral.state.beans.Fan;

public class FanLowState extends State{

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to medium.");
        fan.setState(fan.getFanMediumState());
    }

    @Override
    public String toString() {
        return "Fan is on low";
    }
}
