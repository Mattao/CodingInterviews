package com.matao.common;

/**
 * Created by matao on 7/13/16.
 */
public class TreeNode<T> {
    public T val;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T x) {
        val = x;
    }
}
