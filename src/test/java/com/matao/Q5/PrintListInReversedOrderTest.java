package com.matao.Q5;

import com.matao.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("all")
public class PrintListInReversedOrderTest {

    private PrintListInReversedOrder printListInReversedOrder;
    private ListNode pHead;
    private ListNode single;
    private List<Integer> expected;
    private List<Integer> singleExpected;

    @BeforeEach
    public void setUp() {
        printListInReversedOrder = new PrintListInReversedOrder();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        connectListNodes(node1, node2);
        connectListNodes(node2, node3);
        connectListNodes(node3, node4);
        pHead = node1;

        expected = new ArrayList<>(4);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);

        single = new ListNode(100);
        singleExpected = new ArrayList<>();
        singleExpected.add(100);
    }

    private void connectListNodes(ListNode from, ListNode to) {
        from.next = to;
    }

    @Test
    public void testNormalListByStack() {
        List<Integer> result = printListInReversedOrder.printListReversinglyByStack(pHead);
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testSingleNodeByStack() {
        List<Integer> result = printListInReversedOrder.printListReversinglyByStack(single);
        Assertions.assertEquals(singleExpected, result);
    }

    @Test
    public void testEmptyListByStack() {
        List<Integer> result = printListInReversedOrder.printListReversinglyByStack(null);
        Assertions.assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void testNormalListByRecursion() {
        List<Integer> result = printListInReversedOrder.printListReversinglyByRecursion(pHead);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSingleNodeByRecursion() {
        List<Integer> result = printListInReversedOrder.printListReversinglyByRecursion(single);
        Assertions.assertEquals(singleExpected, result);
    }

    @Test
    public void testEmptyListByRecursion() {
        List<Integer> result = printListInReversedOrder.printListReversinglyByRecursion(null);
        Assertions.assertEquals(Collections.emptyList(), result);
    }
}
