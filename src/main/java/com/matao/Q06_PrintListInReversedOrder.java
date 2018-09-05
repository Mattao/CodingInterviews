package com.matao;

import com.matao.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by matao on 2018/9/5.
 * <p>
 * 输入一个链表，从尾到头打印链表每个节点的值。返回新链表的头结点。
 */
public class Q06_PrintListInReversedOrder {

    // 利用栈
    public List<Integer> printListReversinglyByStack(ListNode head) {
        List<Integer> result = new ArrayList<>();
        if (head == null) {
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value + " ");
            result.add(value);
        }
        return result;
    }

    // 由栈联想到递归，递归的本质是栈
    public List<Integer> printListReversinglyByRecursion(ListNode head) {
        List<Integer> result = new ArrayList<>();
        if (head == null) {
            return result;
        }

        recursionHelper(result, head);
        return result;
    }

    private void recursionHelper(List<Integer> result, ListNode node) {
        if (node == null) {
            return;
        }
        recursionHelper(result, node.next);
        System.out.println(node.val + "");
        result.add(node.val);
    }
}
