package com.rafimiazi.dsa.extra.logicGates;

public class NTypeTransistor extends Transistor {
    public NTypeTransistor(TransistorState state) {
        super(state);
    }

    @Override
    public boolean conducts() {
        return state.isOn();
    }
}
