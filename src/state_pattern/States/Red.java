package state_pattern.States;

import state_pattern.StateTL;

public class Red extends StateTL {
    @Override
    public void show() {
        System.out.println("Red Light");
    }
}
