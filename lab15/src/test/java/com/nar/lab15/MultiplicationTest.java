package com.nar.lab15;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplicationTest {
    @Test
    public void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(8.0, calc.multiply(2.0, 4.0), 0.0001);
    }

    @Test
    public void testMultiplyNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(-8.0, calc.multiply(-2.0, 4.0), 0.0001);
    }
}
