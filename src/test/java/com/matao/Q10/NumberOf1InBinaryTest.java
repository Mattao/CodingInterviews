package com.matao.Q10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberOf1InBinaryTest {

    private NumberOf1InBinary numberOf1InBinary;

    @BeforeEach
    void setUp() {
        numberOf1InBinary = new NumberOf1InBinary();
    }

    @Test
    void testGoodSolutionWithZero() {
        Assertions.assertEquals(0, numberOf1InBinary.numberOf1Good(0));
    }

    @Test
    void testGoodSolutionWithPositiveNumber() {
        Assertions.assertEquals(1, numberOf1InBinary.numberOf1Good(1));
        Assertions.assertEquals(2, numberOf1InBinary.numberOf1Good(10));
        Assertions.assertEquals(31, numberOf1InBinary.numberOf1Good(0x7FFFFFFF));
    }

    @Test
    void testGoodSolutionWithNegativeNumber() {
        Assertions.assertEquals(32, numberOf1InBinary.numberOf1Good(0xFFFFFFFF));
        Assertions.assertEquals(1, numberOf1InBinary.numberOf1Good(0x80000000));
    }

    @Test
    void testBestSolutionWithZero() {
        Assertions.assertEquals(0, numberOf1InBinary.numberOf1Best(0));
    }

    @Test
    void testBestSolutionWithPositiveNumber() {
        Assertions.assertEquals(1, numberOf1InBinary.numberOf1Best(1));
        Assertions.assertEquals(2, numberOf1InBinary.numberOf1Best(10));
        Assertions.assertEquals(31, numberOf1InBinary.numberOf1Best(0x7FFFFFFF));
    }

    @Test
    void testBestSolutionWithNegativeNumber() {
        Assertions.assertEquals(32, numberOf1InBinary.numberOf1Best(0xFFFFFFFF));
        Assertions.assertEquals(1, numberOf1InBinary.numberOf1Best(0x80000000));
    }
}
