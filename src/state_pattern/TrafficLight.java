package state_pattern;

import state_pattern.States.Green;

public class TrafficLight extends StateTL{
    private StateTL objectStateTL;
    public TrafficLight(){
        this.objectStateTL = new Green();
    }
    public void setState(StateTL objectStateTL){
        this.objectStateTL = objectStateTL;
    }
    @Override
    public void show(){
        this.objectStateTL.show();
    }
}
