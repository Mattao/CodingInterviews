package com.matao.Q7;

import com.matao.common.EmptyQueueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueWith2StacksTest {

    private QueueWith2Stacks queueWith2Stacks;

    @BeforeEach
    public void setUp() {
        queueWith2Stacks = new QueueWith2Stacks();
    }

    @Test
    public void testNormal() {
        queueWith2Stacks.enqueque(1);
        queueWith2Stacks.enqueque(2);
        Assertions.assertEquals(1, queueWith2Stacks.dequeue());

        queueWith2Stacks.enqueque(3);
        Assertions.assertEquals(2, queueWith2Stacks.dequeue());
        Assertions.assertEquals(3, queueWith2Stacks.dequeue());
    }

    @Test
    public void testEmptyQueue() {
        Assertions.assertThrows(EmptyQueueException.class, () -> queueWith2Stacks.dequeue());
    }
}
