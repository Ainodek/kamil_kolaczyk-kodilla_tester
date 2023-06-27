package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();

    @Test
    public void subtrackTest1() {
        int subResult = calculator.subtract(5, 7);
        assertEquals(-2, subResult);

    }

    @Test
    public void subtractTest2() {
        int subResult = calculator.subtract(5, 5);
        assertEquals(0, subResult);
    }

    @Test
    public void subtractTest3() {
        int subResult = calculator.subtract(7, 5);
        assertEquals(2, subResult);
    }

    @Test
    public void powLessThanZero() {
        double powResult = calculator.pow(-5);
        assertEquals(25, powResult, 0.001);
    }

    @Test
    public void powZero() {
        double powResult = calculator.pow(0);
        assertEquals(0, powResult, 0.001);
    }

    @Test
    public void powMoreThanZero() {
        double powResult = calculator.pow(5);
        assertEquals(25, powResult, 0.001);
    }
}
