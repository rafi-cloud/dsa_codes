package com.rafimiazi.dsa.extra.logicGates;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class NTypeTransistorTest {

    NTypeTransistor nmos = new NTypeTransistor(TransistorState.ON);
    
    @Test
    void testConductWhenGateStateIsON () {
        TransistorState gateState = TransistorState.ON;

        nmos.setState(gateState);
        assertThat(nmos.conducts()).isEqualTo(true);
    }

    @Test
    void testConductWhenGateStateIsOFF () {
        TransistorState gateState = TransistorState.OFF;
        nmos.setState(gateState);
        assertThat(nmos.conducts()).isEqualTo(false);
    }



}
