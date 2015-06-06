/**
 *	输入一个链表，从尾到头打印链表每个节点的值。返回新链表的头结点。
 *
 *	Author: matao
 */

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class PrintListReversingly {
	public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(listNode == null) {
			return result;
		}
		Stack<Integer> stack = new Stack<Integer>();
		ListNode p = listNode;
		while(p != null) {
			stack.push(p.val);
			p = p.next;
		}
		while(!stack.isEmpty()) {
			result.add(stack.pop());
		}
		return result;
    }
/--------
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
		if(listNode == null) {
			return result;
		}
		printListFromTailToHead2Helper(result, listNode);
		return result;
    }

    public static ArrayList<Integer> printListFromTailToHead2Helper(ArrayList<Integer> result, ListNode listNode) {
    	if (listNode == null) {
    		return result;
    	}
    	printListFromTailToHead2Helper(result, listNode.next);
    	result.add(listNode.val);
    	return result;
    }
//--------

    public static void main(String[] args) {
    	// 1->2->3
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	node1.next = node2;
    	node2.next = node3;
    	System.out.println(printListFromTailToHead1(node1));
    	System.out.println(printListFromTailToHead2(node1));
    }
}