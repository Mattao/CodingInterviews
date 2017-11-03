package com.matao.Q3;

import org.junit.jupiter.api.*;

public class FindInPartiallySortedMatrixTest {

    private FindInPartiallySortedMatrix matrix;
    private int[][] array1;
    private int[][] array2;
    private int[][] array3;
    private int[][] array4;

    @BeforeEach
    public void setUp() {
        matrix = new FindInPartiallySortedMatrix();
        array1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        array2 = new int[][]{
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}
        };
        array3 = null;
        array4 = new int[2][2];
    }

    @Test
    public void testFindInNormalArrayTrue() {
        Assertions.assertEquals(true, matrix.find(array1, 5));
        Assertions.assertEquals(true, matrix.find(array1, 1));
    }

    @Test
    public void testFindInNormalArrayFalse() {
        Assertions.assertEquals(false, matrix.find(array2, 1));
        Assertions.assertEquals(false, matrix.find(array2, 12));
    }

    @Test
    public void testFindInNullArrayFalse() {
        Assertions.assertEquals(false, matrix.find(array3, 10));
    }

    @Test
    public void testFindInEmptyArrayFalse() {
        Assertions.assertEquals(false, matrix.find(array4, 10));
    }
}
