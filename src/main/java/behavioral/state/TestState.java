package behavioral.state;

import behavioral.state.beans.Fan;

public class TestState {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
    }
}
