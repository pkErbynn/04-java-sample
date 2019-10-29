package io.turntabl.maths.test;

import io.turntabl.maths.Numbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {



    @Test
    void testIsPositiveNegative() {
        boolean result = Numbers.isPositive(-1);
        assertFalse(result);
    }

    @Test
    void testIsPositiveZero() {
        boolean result = Numbers.isPositive(0);
        assertFalse(result);
    }

    @Test
    void testIsNegative() {
    }


    @Test
    void sum() {
    }


    @Test
    void testIsEvenAndGreaterThanZero() {
    }
}