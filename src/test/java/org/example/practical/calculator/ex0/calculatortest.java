package org.example.practical.calculator.ex0;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculatortest {

    @Test
    public void testSequenceSum() {

        int terms = 10;


        double sum = calculator.Main.sequenceSum(terms);

        double expected = 42.8;

        assertEquals(expected, sum, 0.1, "The sum of the sequence is incorrect.");
    }
}