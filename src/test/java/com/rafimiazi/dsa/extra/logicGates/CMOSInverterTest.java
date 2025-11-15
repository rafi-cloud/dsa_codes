package com.rafimiazi.dsa.extra.logicGates;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class CMOSInverterTest {

    CMOSInverter inverter = new CMOSInverter();
    @Test
    void testTrue() {
        assertThat(inverter.evaluate(true)).isEqualTo(false);
    }
    @Test
    void testFalse () {
        assertThat(inverter.evaluate(false)).isEqualTo(true);
    }
}
