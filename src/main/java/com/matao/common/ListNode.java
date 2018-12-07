package com.matao.common;

/**
 * Created by matao on 7/12/16.
 */
public class ListNode<T> {
    public T val;
    public ListNode<T> next = null;

    public ListNode(T val) {
        this.val = val;
    }
}
