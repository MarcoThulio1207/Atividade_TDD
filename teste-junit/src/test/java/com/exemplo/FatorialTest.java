package com.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorialTest {

    @Test
    public void testBase() {
        assertEquals(1, Fatorial.calcular(0));
        assertEquals(1, Fatorial.calcular(1));
    }

    @Test
    public void testCinco() {
        assertEquals(120, Fatorial.calcular(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativo() {
        Fatorial.calcular(-1);
    }
}