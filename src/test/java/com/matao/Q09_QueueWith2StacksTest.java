package com.matao;

import com.matao.common.EmptyQueueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2018-12-07.
 */
public class Q09_QueueWith2StacksTest {

    private Q09_QueueWith2Stacks<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new Q09_QueueWith2Stacks<>();
    }

    @Test
    void testEmptyDequeue() {
        Assertions.assertThrows(EmptyQueueException.class, () -> queue.dequeue());
    }

    @Test
    void testNormal() {
        queue.enqueue(1);
        queue.enqueue(2);
        Assertions.assertEquals(1, queue.dequeue().intValue());

        queue.enqueue(3);
        Assertions.assertEquals(2, queue.dequeue().intValue());
        Assertions.assertEquals(3, queue.dequeue().intValue());
    }
}
