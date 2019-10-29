package io.turntabl.maths.test;

import io.turntabl.maths.Numbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
//    for isPositive....analyzing all boundary values
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

    // for isNegative
    @Test
    void testIsNegativeZero() {
        boolean result = Numbers.isNegative(0);
        assertFalse(result);
    }

    @Test
    void testIsNegativeGreaterThanZero() {
        boolean result = Numbers.isNegative(5);
        assertFalse(result);
    }

    // for sum
    @Test
    void sum() {
        int result = Numbers.sum(2, 3);
        assertEquals(5, result);
    }




    @Test
    void testIsEvenAndGreaterThanZero() {
    }
}