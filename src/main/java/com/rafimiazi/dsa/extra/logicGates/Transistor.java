package com.rafimiazi.dsa.extra.logicGates;

public abstract class Transistor {
    protected TransistorState state;

    public Transistor(TransistorState state) {
        this.state = state;
    }

    public TransistorState getState() {
        return state;
    }

    public void setState(TransistorState state) {
        this.state = state;
    }

    public abstract boolean conducts();

}
