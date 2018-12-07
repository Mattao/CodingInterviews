package com.matao.extra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

/**
 * Created by matao on 2018-12-07.
 */
public class StackWith2QueuesTest {

    private StackWith2Queues<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new StackWith2Queues<>();
    }

    @Test
    void testEmptyPop() {
        Assertions.assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void testNormal() {
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.pop().intValue());

        stack.push(3);
        Assertions.assertEquals(3, stack.pop().intValue());
        Assertions.assertEquals(1, stack.pop().intValue());
    }
}
