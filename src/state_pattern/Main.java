package state_pattern;

import state_pattern.States.Red;
import state_pattern.States.Yellow;

public class Main {
    public static void main(String[] args) {
        TrafficLight objectTL = new TrafficLight();
        objectTL.show();

        objectTL.setState(new Yellow());
        objectTL.show();

        objectTL.setState(new Red());
        objectTL.show();
    }
}
