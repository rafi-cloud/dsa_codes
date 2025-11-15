package com.rafimiazi.dsa.extra.logicGates;

public class Gates {
    
    private static final CMOSInverter inverter = new CMOSInverter();

    //NOTGATE
    public static boolean NotGate (boolean input) {
        return inverter.evaluate(input);
    }

  

}
