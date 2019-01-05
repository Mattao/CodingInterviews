package com.matao;

import com.matao.common.ListNode;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 在o(1)时间内删除单链表中指定节点的节点
 */
public class Q18_DeleteNodeInList {

    /**
     * 可以将欲删节点的后一个节点的值拷贝到欲删节点之上，删除欲删节点的后一个节点，从而可以在o(1)时间内完成删除。
     * 若待删除节点为尾结点，单独考虑
     */
    public ListNode<Integer> deleteNode(ListNode<Integer> head, ListNode<Integer> node) {
        if (node.next != null) { // 非尾节点
            node.val = node.next.val;
            node.next = node.next.next;
            return head;
        } else if (head == node) {    // 链表只有一个节点
            return null;
        } else { // 删除尾结点
            ListNode<Integer> tmp = head;
            while (tmp.next != node) {
                tmp = tmp.next;
            }
            tmp.next = null;
            return head;
        }
    }
}
