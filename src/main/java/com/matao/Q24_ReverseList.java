package com.matao;

import com.matao.common.ListNode;

/**
 * Created by matao on 2019-01-06.
 */
public class Q24_ReverseList {

    public ListNode<Integer> reverseList(ListNode<Integer> head) {
        if (head == null || head.next == null) return head;

        ListNode<Integer> curr = head;
        ListNode<Integer> pre;
        ListNode<Integer> post = curr.next;
        while (post != null) {
            pre = curr;
            curr = post;
            post = post.next;
            curr.next = pre;
        }
        return curr;
    }
}
