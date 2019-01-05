package com.matao;

import com.matao.common.InvalidParameterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Q11_MinNumberInRotatedArrayTest {

    private Q11_MinNumberInRotatedArray minNumberInRotatedArray;

    @BeforeEach
    void setUp() {
        minNumberInRotatedArray = new Q11_MinNumberInRotatedArray();
    }

    @Test
    @DisplayName("test an increasing array before rotating")
    void testRotatedIncreasingArray() {
        int[] array = {3, 4, 5, 1, 2};
        Assertions.assertEquals(1, minNumberInRotatedArray.min(array));
    }

    @Test
    @DisplayName("test an array with repeated min number")
    void testRepeatedMinNumberArray() {
        int[] array = {3, 4, 5, 1, 1, 2};
        Assertions.assertEquals(1, minNumberInRotatedArray.min(array));
    }

    @Test
    @DisplayName("test an array with repeated number inside")
    void testRepeatedNumberInsideArray() {
        int[] array = {3, 4, 5, 1, 2, 2};
        Assertions.assertEquals(1, minNumberInRotatedArray.min(array));
    }

    @Test
    @DisplayName("test an array with repeated number in head and tail")
    void testRepeatedNumberInHeadTailArray() {
        int[] array = {1, 0, 1, 1, 1};
        Assertions.assertEquals(0, minNumberInRotatedArray.min(array));
    }

    @Test
    @DisplayName("test an increasing array")
    void testIncreasingArray() {
        int[] array = {1, 2, 3, 4, 5};
        Assertions.assertEquals(1, minNumberInRotatedArray.min(array));
    }

    @Test
    @DisplayName("test single number array")
    void testSingleNumberArray() {
        int[] array = {2};
        Assertions.assertEquals(2, minNumberInRotatedArray.min(array));
    }

    @Test
    @DisplayName("test null array")
    void testNullArray() {
        Assertions.assertThrows(InvalidParameterException.class, () -> minNumberInRotatedArray.min(null));
    }
}
