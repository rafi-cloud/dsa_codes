package com.rafimiazi.dsa.extra.logicGates;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class PTypeTransistorTest {

    PTypeTransistor pmos = new PTypeTransistor(TransistorState.ON);

    @Test
    void testConductWhenGateStateIsON () {
        TransistorState gateState = TransistorState.ON;
        pmos.setState(gateState);
        assertThat(pmos.conducts()).isEqualTo(false);
    }
    @Test 
    void testConductWhenGateStateIsOFF () {
        TransistorState gateState = TransistorState.OFF;
        pmos.setState(gateState);
        assertThat(pmos.conducts()).isEqualTo(true);
    }
}
