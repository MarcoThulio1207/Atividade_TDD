package com.exemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorialTest {

    @Test
    public void testFatorialZero() {
        assertEquals(2, Fatorial.calcularFatorial(2));
    }

}