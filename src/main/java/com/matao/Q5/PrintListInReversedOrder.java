package com.matao.Q5;

import com.matao.common.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。返回新链表的头结点。
 * <p>
 * Author: matao
 */
public class PrintListInReversedOrder {

    // 法1 利用栈
    public ArrayList<Integer> printListReversinglyByStack(ListNode pHead) {
        ArrayList<Integer> result = new ArrayList<>();
        if (pHead == null) {
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode pNode = pHead;
        while (pNode != null) {
            stack.push(pNode.val);
            pNode = pNode.next;
        }
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value + " ");
            result.add(value);
        }
        return result;
    }

    // 法2 由栈联想到递归，递归的本质是栈
    public ArrayList<Integer> printListReversinglyByRecursion(ListNode pHead) {
        ArrayList<Integer> result = new ArrayList<>();
        if (pHead == null) {
            return result;
        }
        while (pHead.next != null) {
            printListReversinglyByRecursion(pHead.next);
        }
        System.out.println(pHead.val + " ");
        result.add(pHead.val);
        return result;
    }
}
