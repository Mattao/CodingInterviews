package com.matao;

import com.matao.common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q18_DeleteNodeInListTest {

    private ListNode<Integer> head;

    @BeforeEach
    void setUp() {
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        ListNode<Integer> node3 = new ListNode<>(3);

        node1.next = node2;
        node2.next = node3;

        head = node1;
    }

    @Test
    void test() {

    }
}
