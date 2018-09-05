package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2018/9/5.
 */
public class Q04_FindInPartiallySortedMatrixTest {

    private Q04_FindInPartiallySortedMatrix findInPartiallySortedMatrix;
    private int[][] data = {
        {1, 2, 8, 9},
        {2, 4, 9, 12},
        {4, 7, 10, 13},
        {6, 8, 11, 15}
    };

    @BeforeEach
    void setUp() {
        findInPartiallySortedMatrix = new Q04_FindInPartiallySortedMatrix();
    }

    @Test
    void testFound() {
        boolean result = findInPartiallySortedMatrix.findInPartiallySortedMatrix(data, 10);
        Assertions.assertTrue(result);
    }

    @Test
    void testNotFound() {
        boolean result = findInPartiallySortedMatrix.findInPartiallySortedMatrix(data, 5);
        Assertions.assertFalse(result);

    }
}
