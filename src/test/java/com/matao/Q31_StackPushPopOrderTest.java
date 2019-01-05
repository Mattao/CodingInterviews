package com.matao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q31_StackPushPopOrderTest {

    private Q31_StackPushPopOrder stackPushPopOrder;

    @BeforeEach
    void setUp() {
        stackPushPopOrder = new Q31_StackPushPopOrder();
    }

    @Test
    void testTrue() {
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 5, 3, 2, 1};
        Assertions.assertTrue(stackPushPopOrder.isPopOrder(push, pop));
    }

    @Test
    void testFalse() {
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 3, 5, 1, 2};
        Assertions.assertFalse(stackPushPopOrder.isPopOrder(push, pop));
    }
}
