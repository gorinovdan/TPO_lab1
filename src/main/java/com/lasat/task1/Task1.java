package com.lasat.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task1 {

    // Реализация функции arctan(x) через ряд Тейлора
    public static double arctan(double x) {
        if (Math.abs(x) > 1) {
            throw new IllegalArgumentException("Argument out of range");
        }
        double result = 0;
        for (int n = 0; n < 100; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / (2 * n + 1);
            result += term;
        }
        return result;
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 0.7854", "-1, -0.7854"})
    public void testArctan(double input, double expected) {
        assertEquals(expected, arctan(input), 0.0001);
    }

    @ParameterizedTest
    @CsvSource({"2", "-2"})
    public void testArctanOutOfRange(double input) {
        assertThrows(IllegalArgumentException.class, () -> arctan(input));
    }

    @ParameterizedTest
    @CsvSource({"0.5, 0.4636", "-0.5, -0.4636"})
    public void testArctanBetweenZeroAndOne(double input, double expected) {
        assertEquals(expected, arctan(input), 0.0001);
    }
}
