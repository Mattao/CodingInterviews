package com.matao;

import com.matao.common.ListNode;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 求链表中倒数第k个节点。链表的尾节点定义为倒数第1个节点。
 */
public class Q22_KthNodeFromEnd {

    /**
     * 双指针，第一个指针先走k-1步
     */
    public static ListNode<Integer> findKthToTail(ListNode<Integer> head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode<Integer> slow = head, fast = head;
        for (int i = 0; i < k; i++) {
            if (fast.next != null || i == k - 1) {
                fast = fast.next;
            } else {
                return null;
            }
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
