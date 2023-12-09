package org.siriys;

import org.siriys.enums.State;
import org.siriys.interfaces.IObserver;

public abstract class MumiTrollFamilyMember extends Character implements IObserver {
    protected State state = State.IDLE;

    public MumiTrollFamilyMember(String name) {
        super(name);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void renderCurrentState() {
        System.out.println(this.name + " в состоянии " + this.state);
    }

    @Override
    public void update(String date) {
        System.out.println(name + " видит: " + date);
    }
}
