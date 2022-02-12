package ru.alexpvl;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @org.junit.Before
    public void setup() {
        utilities = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] input = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        char[] output = {'h', 'e', 'l', 'l', 'o'};
        assertArrayEquals(input, output);
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("Anything", utilities.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, utilities.converter(10 ,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() {
        utilities.converter(10 ,0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNotNull(utilities.nullIfOddLength("1234"));
        assertNull(utilities.nullIfOddLength("123"));
    }
}