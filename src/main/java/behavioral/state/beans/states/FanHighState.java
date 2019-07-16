package behavioral.state.beans.states;

import behavioral.state.beans.Fan;

public class FanHighState extends State{

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        fan.setState(fan.getFanOffState());
        System.out.println("Turning off the fan");
    }

    @Override
    public String toString() {
        return "The fan is on high";
    }
}
