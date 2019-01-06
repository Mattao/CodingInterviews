package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q40_KLeastNumbersTest {

    private Q40_KLeastNumbers kLeastNumbers;

    @BeforeEach
    void setUp() {
        kLeastNumbers = new Q40_KLeastNumbers();
    }

    @Test
    void testNull() {
        Assertions.assertEquals(Integer.MIN_VALUE, kLeastNumbers.getLeastNumbers(null, 1));
    }

    @Test
    void testEmptyArray() {
        int[] a = {};
        Assertions.assertEquals(Integer.MIN_VALUE, kLeastNumbers.getLeastNumbers(a, 1));
    }

    @Test
    void test1() {
        int[] array = {4, 5, 1, 6, 2, 7, 3, 8};
        Assertions.assertEquals(4, kLeastNumbers.getLeastNumbers(array, 4));
    }

    @Test
    void test2() {
        int[] array = {6, 1, 3, 5, 4, 2};
        Assertions.assertEquals(5, kLeastNumbers.getLeastNumbers(array, 5));
    }
}
