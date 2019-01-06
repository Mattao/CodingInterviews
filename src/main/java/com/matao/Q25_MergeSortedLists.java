package com.matao;

import com.matao.common.ListNode;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 输入两个递增排序的链表，要求合并后保持递增。
 */
@SuppressWarnings("Duplicates")
public class Q25_MergeSortedLists {

    public ListNode<Integer> mergeRecursion(ListNode<Integer> head1, ListNode<Integer> head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        ListNode<Integer> p = head1;
        ListNode<Integer> q = head2;
        ListNode<Integer> mergedHead;

        if (p.val < q.val) {
            mergedHead = p;
            mergedHead.next = mergeRecursion(p.next, q);
        } else {
            mergedHead = q;
            mergedHead.next = mergeRecursion(p, q.next);
        }

        return mergedHead;
    }

    public ListNode<Integer> merge(ListNode<Integer> head1, ListNode<Integer> head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        ListNode<Integer> p = head1;
        ListNode<Integer> q = head2;

        ListNode<Integer> dummy = new ListNode<>(0);
        ListNode<Integer> r = dummy;
        while (p != null && q != null) {
            if (p.val < q.val) {
                r.next = p;
                p = p.next;
            } else {
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }
        if (p != null) {
            r.next = p;
        }
        if (q != null) {
            r.next = q;
        }
        return dummy.next;
    }
}
