package com.matao;

import com.matao.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2019-01-06.
 */
public class Q23_EntryNodeInListLoopTest {

    private Q23_EntryNodeInListLoop entryNodeInListLoop;
    private ListNode<Integer> node1;
    private ListNode<Integer> node2;
    private ListNode<Integer> node3;
    private ListNode<Integer> node4;
    private ListNode<Integer> node5;
    private ListNode<Integer> node6;

    @BeforeEach
    void setUp() {
        entryNodeInListLoop = new Q23_EntryNodeInListLoop();

        node1 = new ListNode<>(1);
        node2 = new ListNode<>(2);
        node3 = new ListNode<>(3);
        node4 = new ListNode<>(4);
        node5 = new ListNode<>(5);
        node6 = new ListNode<>(6);
    }

    @Test
    void testNull() {
        Assertions.assertNull(entryNodeInListLoop.entryNodeOfLoop(null));
    }

    @Test
    void testLoop() {
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3; // 即环入口在 node3
        ListNode<Integer> head = node1;
        Assertions.assertEquals(node3, entryNodeInListLoop.entryNodeOfLoop(head));
    }

    @Test
    void testSingleNode() {
        ListNode<Integer> head = node1;
        node1.next = null;
        Assertions.assertNull(entryNodeInListLoop.entryNodeOfLoop(head));
    }

    @Test
    void testNoLoop() {
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;
        ListNode<Integer> head = node1;
        Assertions.assertNull(entryNodeInListLoop.entryNodeOfLoop(head));
    }
}
