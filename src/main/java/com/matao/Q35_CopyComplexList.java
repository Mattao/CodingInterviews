package com.matao;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matao on 2019-01-06.
 */
public class Q35_CopyComplexList {

    public static class ComplexListNode {
        int val;
        ComplexListNode next;
        ComplexListNode random;

        public ComplexListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 用一个哈希表记录旧链表每个节点到新链表对应节点的映射, 用于快速获取对应的 random 指向
     */
    public ComplexListNode clone1(ComplexListNode head) {
        if (head == null) return null;

        Map<ComplexListNode, ComplexListNode> map = new HashMap<>();
        ComplexListNode newHead = new ComplexListNode(head.val);
        map.put(head, newHead);

        ComplexListNode curr = head.next;
        ComplexListNode newCurr;
        ComplexListNode pre = newHead;
        while (curr != null) {
            newCurr = new ComplexListNode(curr.val);
            map.put(curr, newCurr);

            pre.next = newCurr;
            pre = newCurr;
            curr = curr.next;
        }

        curr = head;
        newCurr = newHead;
        while (curr != null) {
            newCurr.random = map.get(curr.random);
            curr = curr.next;
            newCurr = newCurr.next;
        }

        return newHead;
    }

    /**
     * 1）cloneNodes 完成新链表节点的创建，仅对 val 域赋值，且每个新节点接在原链表对应节点的后面。
     * 如 A->B->C, 处理完后为 A->A'->B->B'->C->C'，时间复杂度o(n)。
     * 2）connectRandomNode 完成 random 域的赋值。假设 A.random=C,我们需要设置 A'.random=C'，
     * 此处获取C'可以在o(1)的时间复杂度完成，全部赋值完毕时间复杂度为o(n)。
     * 3）reconnectNodes就是将上述链表重组，使A->A'->B->B'->C->C'变为A->B->C，A'->B'->C'。此处需要注意尾部null的处理。
     */
    public ComplexListNode clone2(ComplexListNode head) {
        if (head == null) return null;

        cloneNodes(head);
        connectRandomNodes(head);
        return reconnectNodes(head);
    }

    private void cloneNodes(ComplexListNode head) {
        ComplexListNode curr = head;
        while (curr != null) {
            ComplexListNode tmp = new ComplexListNode(curr.val);
            tmp.next = curr.next;
            curr.next = tmp;
            curr.next = curr.next.next;
        }
    }

    private void connectRandomNodes(ComplexListNode head) {
        ComplexListNode curr = head;
        ComplexListNode currNext = curr.next;
        while (true) {
            if (curr.random != null) {
                currNext.random = curr.random.next;
            }
            curr = curr.next.next;
            if (curr == null) {
                break;
            }
            currNext = currNext.next.next;
        }
    }

    private ComplexListNode reconnectNodes(ComplexListNode head) {
        ComplexListNode newHead = head.next;
        ComplexListNode curr = head;
        ComplexListNode newCurr = newHead;
        while (true) {
            curr.next = curr.next.next;
            curr = curr.next;
            if (curr == null) {
                newCurr.next = null;
                break;
            }
            newCurr.next = newCurr.next.next;
            newCurr = newCurr.next;
        }
        return newHead;
    }
}
