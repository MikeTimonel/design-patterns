package state_pattern.States;

import state_pattern.StateTL;

public class Green extends StateTL {
    @Override
    public void show() {
        System.out.println("Green Light");
    }
}
