package com.matao.Q13;

import com.matao.common.ListNode;

/**
 * 给定单项链表的头指针和一个结点指针， 定义一个函数在O(1)的时间删除该结点
 * <p>
 * Author: matao
 */
public class DeleteNodeList {

    public static void delete(ListNode<Integer> list, ListNode<Integer> targetNode) {
        if (list == null || targetNode == null) {
            return;
        }

        if (targetNode.next != null) { //待删结点不是最后一个结点
            ListNode<Integer> p = targetNode.next;
            targetNode.val = p.val;
            targetNode.next = p.next;
            p = null;
        } else if (list != targetNode) {  //待删结点是尾结点，但不是头结点
            ListNode<Integer> p = list;
            while (p.next != targetNode) {
                p = p.next;
            }
            p.next = null;
            targetNode = null;
        } else {
            list = null;
        }
    }

    public static void print(ListNode<Integer> list) {
        if (list == null) {
            return;
        }
        ListNode<Integer> p = list;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode<Integer> node1 = new ListNode<>(1);
        ListNode<Integer> node2 = new ListNode<>(2);
        ListNode<Integer> node3 = new ListNode<>(3);
        node1.next = node2;
        node2.next = node3;

        System.out.println("origin list: ");
        print(node1);

        System.out.println("delete node 2: ");
        delete(node1, node2);
        print(node1);

        System.out.println("delete node 1: ");
        delete(node1, node1);
        print(node1);
    }
}