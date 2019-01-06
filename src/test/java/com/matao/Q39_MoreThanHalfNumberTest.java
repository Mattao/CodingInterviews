package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q39_MoreThanHalfNumberTest {

    private Q39_MoreThanHalfNumber moreThanHalfNumber;

    @BeforeEach
    void setUp() {
        moreThanHalfNumber = new Q39_MoreThanHalfNumber();
    }

    @Test
    void testNull() {
        Assertions.assertEquals(Integer.MIN_VALUE, moreThanHalfNumber.moreThanHalfNum(null));
    }

    @Test
    void test() {
        int[] data = {1,2,3,2,2,2,5,4,2};
        Assertions.assertEquals(2, moreThanHalfNumber.moreThanHalfNum(data));
    }
}
