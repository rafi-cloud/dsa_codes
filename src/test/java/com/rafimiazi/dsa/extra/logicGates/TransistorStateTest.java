package com.rafimiazi.dsa.extra.logicGates;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class TransistorStateTest {
    @Test
    void testFromBoolean() {
        assertThat(TransistorState.fromBoolean(false)).isEqualTo(TransistorState.OFF);
    }
    @Test
    void testFromBooleanON() {
        assertThat(TransistorState.fromBoolean(true)).isEqualTo(TransistorState.ON);
    }

}
