package com.rafimiazi.dsa.extra.logicGates;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class GatesTest {
    @Test
    void testNotGate() {
        assertThat(Gates.NotGate(true)).isEqualTo(false);
        assertThat(Gates.NotGate(false)).isEqualTo(true);
    }
}
