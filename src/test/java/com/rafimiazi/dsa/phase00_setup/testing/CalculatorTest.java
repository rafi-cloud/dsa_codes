package com.rafimiazi.dsa.phase00_setup.testing;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    public CalculatorTest() {
    }

    @Test
    void check () {
        assertThat(66).isNotNull();
    }


    


    @ParameterizedTest
    @CsvSource({
        "1,2,3",
        "2,3,5",
        "3,4,7"
    })
    void testAdd (int a, int b, int res) {
        Calculator calc = new Calculator();
        assertThat(calc.add(a, b)).isEqualTo(res);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)

    void testAddFromFile (int a, int b, int result) {
        Calculator calc = new Calculator();
        assertThat(calc.add(a, b)).isEqualTo(result);
    }

    







}


