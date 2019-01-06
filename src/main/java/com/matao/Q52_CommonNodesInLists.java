package com.matao;

import com.matao.common.ListNode;

import java.util.LinkedList;

/**
 * Created by matao on 2019-01-06.
 * <pre>
 * 输入两个单链表，找出它们的第一个公共节点。以下图为例，对一个公共节点为6所在的节点。
 * 1 -> 2 -> 3 -> 6 -> 7
 *      4 -> 5 ↗
 * </pre>
 */
public class Q52_CommonNodesInLists {

    /**
     * 从链表的尾部向前看，发现尾部是相同的，向前走会分叉，找到分叉点即可。
     * 对于单链表，本身是前节点->后节点，想要得到后节点->前节点，可以借助于栈的后进先出特性。
     */
    public ListNode<Integer> findFirstCommonNode1(ListNode<Integer> head1, ListNode<Integer> head2) {
        LinkedList<ListNode<Integer>> stack1 = new LinkedList<>();
        LinkedList<ListNode<Integer>> stack2 = new LinkedList<>();

        ListNode<Integer> curr = head1;
        while (curr != null) {
            stack1.push(curr);
            curr = curr.next;
        }
        curr = head2;
        while (curr != null) {
            stack2.push(curr);
            curr = curr.next;
        }

        ListNode<Integer> commonNode = null;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.peek() == stack2.peek()) {
                commonNode = stack1.pop();
                stack2.pop();
            } else {
                break;
            }
        }
        return commonNode;
    }

    /**
     * 对于单链表，如果从头结点开始找公共节点，一个麻烦点是两个链表长度可能不一致，
     * 因此两个指针不同步（指两个指针无法同时指向公共点）。
     * 那么，能否让两个链表长度一致？
     * 长链表先行几步即可，因为长链表头部多出的那几个节点一定不会是两链表的公共节点。
     */
    public ListNode<Integer> findFirstCommonNode2(ListNode<Integer> head1, ListNode<Integer> head2) {
        ListNode<Integer> curr1 = head1, curr2 = head2;
        int size1 = 0, size2 = 0;
        while (curr1 != null) {
            size1++;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            size2++;
            curr2 = curr2.next;
        }

        curr1 = head1;
        curr2 = head2;
        while (size1 > size2) {
            curr1 = curr1.next;
            size1--;
        }
        while (size1 < size2) {
            curr2 = curr2.next;
            size2--;
        }

        while (curr1 != null && curr2 != null && curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr1;
    }
}
