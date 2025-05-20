package com.exemplo;

public class Fatorial {
    public static long calcular(int n) {
        if (n < 0) throw new IllegalArgumentException("Fatorial não aceita negativos");
        long resultado = 1;
        for (int i = 1; i <= n; i++) resultado *= i;
        return resultado;
    }
}