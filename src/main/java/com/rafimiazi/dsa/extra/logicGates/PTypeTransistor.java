package com.rafimiazi.dsa.extra.logicGates;

public class PTypeTransistor extends Transistor {
    
    public PTypeTransistor (TransistorState state) {
        super(state);
    }
    @Override
    public boolean conducts () {
        return !state.isOn();
    }
}
