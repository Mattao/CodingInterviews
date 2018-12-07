package com.matao.Q17;

import com.matao.common.ListNode;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * <p>
 * Author: matao
 */
public class MergeSortedLists {

    public static ListNode<Integer> merge(ListNode<Integer> list1, ListNode<Integer> list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode<Integer> dummy = new ListNode<>(0);
        ListNode<Integer> p = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        while (list1 != null) {
            p.next = list1;
            list1 = list1.next;
        }

        while (list2 != null) {
            p.next = list2;
            list2 = list2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        ListNode<Integer> node3 = new ListNode<>(3);
        ListNode<Integer> node4 = new ListNode<>(4);
        ListNode<Integer> node5 = new ListNode<>(5);

        // 1->5;
        node1.next = node5;

        // 2->3->4
        node2.next = node3;
        node3.next = node4;

        ListNode<Integer> merged = merge(node1, node2);
        ListNode<Integer> p = merged;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
}