package com.matao;
/**
 *	输入一个链表，反转链表后，输出反转链表后头节点
 */

public class ReverseList {
    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


	public static ListNode reverse(ListNode list) {
		if (list == null) {
			return null;
		}
		ListNode pre = null, p = list, q = null;
		while(p != null) {
			q = p.next;
			p.next = pre;
			pre = p;
			p = q;
		}
		return pre;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;

		ListNode p = node1;
		while(p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println();

		p = reverse(node1);
		while(p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println();
	}
}