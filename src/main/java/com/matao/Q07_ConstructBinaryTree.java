package com.matao;

import com.matao.common.TreeNode;

/**
 * Created by matao on 2018-12-10.
 * 根据二叉树的前序遍历和中序遍历，重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列 {1,2,4,7,3,5,6,8} 和中序遍历序列 {4,7,2,1,5,3,8,6} ，
 * 则重建二叉树并输出它的后序遍历序列。(测试用例中，"树"的输出形式类似于树的层次遍历，没有节点的用#来代替)
 */
public class Q07_ConstructBinaryTree {

    public TreeNode<Integer> constructBinaryTree(int[] preOrder, int[] inOrder) {
        if (preOrder == null || inOrder == null) return null;
        if (preOrder.length != inOrder.length) return null;

        return constructBinaryTree(preOrder, 0, inOrder, 0, preOrder.length);
    }

    /**
     * <pre>
     *           1
     *         /   \
     *        2     3
     *       / \
     *      4   5
     * </pre>
     * 前序遍历为 12453，中序遍历为 42513。
     * 前序的第一个数字 1 表明了树的根节点，结合中序可知，425为根节点的左子树，3为根节点的右子树。
     * 对于左子树部分，它的前序为245，中序为425，继续分而重建。对于左子树也如此。
     */
    private TreeNode<Integer> constructBinaryTree(int[] preOrder, int preStart,
                                                  int[] inOrder, int inStart,
                                                  int length) {
        if (length == 0) return null;
        TreeNode<Integer> root = new TreeNode<>(preOrder[preStart]);

        int rootInOrderPos;
        for (rootInOrderPos = inStart; rootInOrderPos < inStart + length; rootInOrderPos++) {
            if (root.val == inOrder[rootInOrderPos]) {
                break;
            }
        }

        int leftLength = rootInOrderPos - inStart;
        int rightLength = length - leftLength - 1;
        root.left = constructBinaryTree(preOrder, preStart + 1, inOrder, inStart, leftLength);
        root.right = constructBinaryTree(preOrder, preStart + leftLength + 1, inOrder, rootInOrderPos + 1, rightLength);

        return root;
    }
}
