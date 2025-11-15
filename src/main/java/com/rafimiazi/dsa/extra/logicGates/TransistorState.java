package com.rafimiazi.dsa.extra.logicGates;

public enum TransistorState {
    ON, OFF;

    public boolean isOn () {
        return this == ON;
    }

    public static TransistorState fromBoolean (boolean bool) {
        return bool ? ON : OFF;
    }
}
