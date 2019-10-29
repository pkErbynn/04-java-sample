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
        boolean result = Numbers.isPositive(4);
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
    void sumAsMultiplication() {
        int result = Numbers.sum(2, 3);
        assertNotEquals(6, 5);
    }

    @Test
    void sumAsDivision() {
        int result = Numbers.sum(6, 3);
        assertNotEquals(2, 9);
    }


    // odd
    @Test
    void testIsEvenAndGreaterThanZeroOdd() {
        boolean result = Numbers.isEvenAndGreaterThanZero(3);
        assertFalse(result);
    }

    @Test
    void testIsEvenAndGreaterThanZeroNegative() {
        boolean result = Numbers.isEvenAndGreaterThanZero(-4);
        assertFalse(result);
    }

    @Test
    void testIsEvenAndGreaterThanZero() {
        boolean result = Numbers.isEvenAndGreaterThanZero(4);
        assertTrue(result);
    }


    // leap year....testing for all failures
    @Test
    void isALeapYearNotDivisibleBy4() {
        boolean result = Numbers.isALeapYear(102);
        assertFalse(result);
    }

    @Test
    void isALeapYearCenturyYearButNotDivisibleBy4() {
        boolean result = Numbers.isALeapYear(250);
        assertFalse(result);
    }

    @Test
    void isALeapYear() {
        boolean result = Numbers.isALeapYear(400);
        assertTrue(result);
    }
}