package com.matao.common;

/**
 * Created by matao on 2018-12-10.
 * 带有父节点信息的树节点
 */
public class TreeNodeWithParent<T> {
    public T val;
    public TreeNodeWithParent left;
    public TreeNodeWithParent right;
    public TreeNodeWithParent parent;

    public TreeNodeWithParent(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
