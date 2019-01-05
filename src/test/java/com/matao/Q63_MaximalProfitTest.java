package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q63_MaximalProfitTest {

    private Q63_MaximalProfit maximalProfit;

    @BeforeEach
    void setUp() {
        maximalProfit = new Q63_MaximalProfit();
    }

    @Test
    void test1() {
        int[] data = new int[]{9, 11, 8, 5, 7, 12, 16, 14};
        Assertions.assertEquals(11, maximalProfit.maxDiff(data));
    }

    @Test
    void test2() {
        int[] data = new int[]{9, 8, 7, 6, 5, 4, 3, 1};
        Assertions.assertEquals(-1, maximalProfit.maxDiff(data));
    }
}
