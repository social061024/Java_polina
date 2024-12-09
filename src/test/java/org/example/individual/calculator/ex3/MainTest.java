package org.example.individual.calculator.ex3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testCalculateExpression() {

        double x = 2.0;
        double a = 3.12;
        double b = 2.14;
        double c = 1.21;


        double result = Main.calculateExpression(x, a, b, c);


        double expected = (Math.pow(b - c, 2) * a / Math.log(Math.pow(x, 2) + c)) + Math.exp(Math.pow(c - x, 2));


        assertEquals(expected, result, 0.0001);
    }
}
