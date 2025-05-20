package com.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorialTest {

    @Test
    public void testFatorialZero() {
        assertEquals(1, Fatorial.calcularFatorial(0));
    }

}