package com.rafimiazi.dsa.extra.logicGates;

public class CMOSInverter {
    private final PTypeTransistor pmos;
    private final NTypeTransistor nmos;

    public CMOSInverter () {
        this.pmos = new PTypeTransistor(TransistorState.OFF);
        this.nmos = new NTypeTransistor(TransistorState.ON);
    }

    public boolean evaluate (boolean input) {
        TransistorState gateState = TransistorState.fromBoolean(input);
        pmos.setState(gateState);
        nmos.setState(gateState);

        if (pmos.conducts()) {
            return true;
        }else if (nmos.conducts()) {
            return false;
        }
        return false;
    }
    
}
