package lesson6.powercalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    @Test
    void resultNumber() {

        PowerCalculator victim = new PowerCalculator();

        int expected = 27;

        int actual = victim.resultNumber(3,3);

        assertEquals(expected, actual);

    }

}