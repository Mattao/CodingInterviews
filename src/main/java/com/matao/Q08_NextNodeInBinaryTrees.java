package com.matao;

import com.matao.common.TreeNodeWithParent;

/**
 * Created by matao on 2018-12-10.
 * <p>
 * 给定二叉树和其中一个节点，找到中序遍历序列的下一个节点。
 * 树中的节点除了有左右孩子指针，还有一个指向父节点的指针。
 */
public class Q08_NextNodeInBinaryTrees {

    /**
     * <pre>
     *                  1
     *               //   \\
     *              2       3
     *            // \\    // \\
     *           4     5  6    7
     *              // \\
     *              8   9
     *
     *       inorder : 4 2 8 5 9 1 6 3 7
     *
     * 1. 如果该节点有右孩子，则中序遍历序列的下一个节点为其右子树的最左边叶子节点
     * 2. 如果该节点无右孩子
     *      2.1 该节点为其父节点的左子树节点，则中序遍历序列的下一个节点为其父节点
     *      2.2 该节点为其父节点的右子树节点，则沿着向父节点的指针一直向上遍历，
     *          直到找到一个是它父节点的左子节点的节点,如果这个节点存在，则概念节点的父节点就是我们要找的节点
     * </pre>
     */
    public TreeNodeWithParent getNext(TreeNodeWithParent node) {
        if (node == null) return null;

        if (node.right != null) {   // 节点有右孩子
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {    // 节点无右孩子
            if (node.val == node.parent.left.val) {
                return node.parent;
            } else {
                while (node.parent != null && node != node.parent.left) {
                    node = node.parent;
                }
                return node.parent;
            }
        }
    }
}
