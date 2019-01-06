package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q21_ReorderArrayTest {

    private Q21_ReorderArray reorderArray;

    @BeforeEach
    void setUp() {
        reorderArray = new Q21_ReorderArray();
    }

    @Test
    void testNull() {
        Assertions.assertNull(reorderArray.reorder(null));
    }

    @Test
    void testEmptyArray() {
        int[] data = {};
        int[] result = {};
        Assertions.assertArrayEquals(data, reorderArray.reorder(data));
    }

    @Test
    void testSingleElementArray() {
        int[] data = {1};
        int[] result = {1};
        Assertions.assertArrayEquals(data, reorderArray.reorder(data));
    }

    @Test
    void testArray() {
        int[] data = {1, 2, 3, 4, 5, 7, 7};
        int[] result = {1, 7, 3, 7, 5, 4, 2};
        Assertions.assertArrayEquals(result, reorderArray.reorder(data));
    }
}
