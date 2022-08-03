package state_pattern.States;

import state_pattern.StateTL;

public class Yellow extends StateTL {
    @Override
    public void show() {
        System.out.println("Yellow Light");
    }
}
