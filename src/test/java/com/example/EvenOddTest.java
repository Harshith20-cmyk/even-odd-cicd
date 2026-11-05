
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertTrue(EvenOdd.isEven(2));
    }

    @Test
    void testOddNumber() {
        assertFalse(EvenOdd.isEven(5));
    }

    @Test
    void testZero() {
        assertTrue(EvenOdd.isEven(0));
    }

    @Test
    void testNegativeNumber() {
        assertTrue(EvenOdd.isEven(-4));
    }
}
