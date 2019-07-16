package behavioral.state.beans;

import behavioral.state.beans.states.*;

public class Fan {
    State fanOffState;
    State fanLowState;
    State fanMediumState;
    State fanHighState;

    State state = null;


    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMediumState = new FanMediumState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void pullChain(){
        state.handleRequest();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
