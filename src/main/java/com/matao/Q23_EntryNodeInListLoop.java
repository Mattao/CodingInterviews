package com.matao;

import com.matao.common.ListNode;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 假设一个链表中包含环，请找出入口节点。若没有环则返回null。
 */
public class Q23_EntryNodeInListLoop {

    /**
     * 先找到相遇的节点。从相遇节点开始继续遍历，
     * 再次到达相遇节点时候便可计算出环中节点数量 n。
     * 之后从头开始双指针，快指针先移动n步，之后两个指针每次移动一步，再次相遇时便是入口节点
     */
    public ListNode<Integer> entryNodeOfLoop(ListNode<Integer> head) {
        if (head == null) return null;
        ListNode<Integer> meetingNode = findMeetingNode(head);
        if (meetingNode == null) {
            return null;
        }

        int nodesCountInLoop = 1;
        ListNode<Integer> p = meetingNode;
        while (p.next != meetingNode) {
            p = p.next;
            nodesCountInLoop++;
        }

        p = head;
        for (int i = 0; i < nodesCountInLoop; i++) {
            p = p.next;
        }

        ListNode<Integer> q = head;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }

    private ListNode<Integer> findMeetingNode(ListNode<Integer> head) {
        if (head == null) return null;

        ListNode<Integer> slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
}
