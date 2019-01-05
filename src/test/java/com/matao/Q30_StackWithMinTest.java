package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

/**
 * Created by matao on 2019-01-06.
 */
public class Q30_StackWithMinTest {

    private Q30_StackWithMin<Integer> stackWithMin;

    @BeforeEach
    void setUp() {
        stackWithMin = new Q30_StackWithMin<>();
    }

    @Test
    void testEmptyStack() {
        Assertions.assertThrows(EmptyStackException.class, () -> stackWithMin.min());
    }

    @Test
    void test() {
        stackWithMin.push(1);
        stackWithMin.push(3);
        stackWithMin.push(-1);
        Assertions.assertEquals(-1, stackWithMin.min().intValue());
    }
}
