package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2018/8/24.
 */
public class Q03_DuplicationInArrayTest {
    private Q03_DuplicationInArray duplicationInArray;
    private int[] data1;
    private int[] data2;

    @BeforeEach
    void setUp() {
        duplicationInArray = new Q03_DuplicationInArray();
        data1 = new int[]{2, 3, 1, 0, 2, 5, 3};
        data2 = new int[]{2, 3, 1, 0, 4, 5, 5};
    }

    @Test
    void testFindDuplication1() {
        Assertions.assertEquals(2, duplicationInArray.findDuplication1(data1));
        Assertions.assertEquals(5, duplicationInArray.findDuplication1(data2));
    }

    @Test
    void testFindDuplication2() {
        Assertions.assertEquals(2, duplicationInArray.findDuplication2(data1));
        Assertions.assertEquals(5, duplicationInArray.findDuplication2(data2));
    }

    @Test
    void testFindDuplication3() {
        Assertions.assertEquals(2, duplicationInArray.findDuplication3(data1));
        Assertions.assertEquals(5, duplicationInArray.findDuplication3(data2));
    }

    @Test
    void testFindDuplication4() {
        Assertions.assertEquals(2, duplicationInArray.findDuplication4(data1));
        Assertions.assertEquals(5, duplicationInArray.findDuplication4(data2));
    }

    @Test
    void testFindDuplication5() {
        Assertions.assertEquals(2, duplicationInArray.findDuplication5(data1));
        Assertions.assertEquals(5, duplicationInArray.findDuplication5(data2));
    }
}
