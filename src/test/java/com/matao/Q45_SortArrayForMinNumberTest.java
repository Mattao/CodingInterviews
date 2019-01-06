package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q45_SortArrayForMinNumberTest {

    private Q45_SortArrayForMinNumber sortArrayForMinNumber;

    @BeforeEach
    void setUp() {
        sortArrayForMinNumber = new Q45_SortArrayForMinNumber();
    }

    @Test
    void test() {
        int[] data = {3, 32, 321};
        Assertions.assertEquals(321323, sortArrayForMinNumber.minNumber(data));
    }
}
