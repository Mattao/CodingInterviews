package com.matao;

import com.matao.common.InvalidParameterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2018-12-07.
 */
public class Q10_FibonacciTest {

    private Q10_Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Q10_Fibonacci();
    }

    @Test
    void testFibRecursion() {
        Assertions.assertEquals(1, fibonacci.fibRecursion(1));
        Assertions.assertEquals(233, fibonacci.fibRecursion(13));
        Assertions.assertThrows(InvalidParameterException.class, () -> fibonacci.fibRecursion(-1));
    }

    @Test
    void testFibIteration() {
        Assertions.assertEquals(1, fibonacci.fibIteration(1));
        Assertions.assertEquals(233, fibonacci.fibIteration(13));
        Assertions.assertThrows(InvalidParameterException.class, () -> fibonacci.fibIteration(-1));
    }
}
