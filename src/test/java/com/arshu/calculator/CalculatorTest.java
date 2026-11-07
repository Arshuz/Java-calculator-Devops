
package com.arshu.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(15.0, Calculator.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5.0, Calculator.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, Calculator.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, Calculator.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> Calculator.divide(10, 0)
        );
    }
}
