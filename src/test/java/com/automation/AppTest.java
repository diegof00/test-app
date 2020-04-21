package com.automation;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static final double DELTA = 1e-15;
    private static final int NUM1 = 50;
    private static final int NUM2 = 100;

    @Test
    public void shouldreturnMaxValue() {
        assertEquals(NUM2, Math.max(NUM1, NUM2));
    }

    @Test
    public void shouldReturnCosValueForAngle() {
        assertEquals(BigInteger.ONE.doubleValue(), Math.cos(BigInteger.ZERO.doubleValue()), DELTA);
    }

    @Test
    public void shouldReturnilForGivenValue() {
        assertEquals(BigInteger.ONE.doubleValue(), Math.ceil(0.1), DELTA);
    }

}
