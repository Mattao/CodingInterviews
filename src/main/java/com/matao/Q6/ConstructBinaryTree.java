package com.matao.Q6;

import com.matao.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并输出它的后序遍历序列。(测试用例中，"树"的输出形式类似于树的层次遍历，没有节点的用#来代替)
 * <p>
 * Author: matao
 */
public class ConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        if (pre.length != in.length) {
            return null;
        }
        return reConstructBinaryTreeHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public TreeNode reConstructBinaryTreeHelper(int[] pre, int[] in, int preStart,
                                                int preEnd, int inStart, int inEnd) {
        TreeNode root = new TreeNode(pre[preStart]);
        root.left = null;
        root.right = null;

        if (preStart == preEnd && inStart == inEnd) {
            return root;
        }
        int rootInOrderPos;
        for (rootInOrderPos = inStart; rootInOrderPos <= inEnd; rootInOrderPos++) {
            if (in[rootInOrderPos] == root.val) {
                break;
            }
        }

        if (rootInOrderPos == inEnd && in[rootInOrderPos] != root.val) {   //in中不存在root结点，即in数组错误
            return null;
        }

        int leftLength = rootInOrderPos - inStart;
        int rightLength = inEnd - rootInOrderPos;
        if (leftLength > 0) {
            root.left = reConstructBinaryTreeHelper(pre, in, preStart + 1, preStart + leftLength, inStart, rootInOrderPos - 1);
        }
        if (rightLength > 0) {
            root.right = reConstructBinaryTreeHelper(pre, in, preStart + 1 + leftLength, preEnd, rootInOrderPos + 1, inEnd);
        }

        return root;
    }

    public List<Integer> preTraverse(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        preTraverseHelper(root, list);
        return list;
    }

    private void preTraverseHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preTraverseHelper(root.left, result);
        preTraverseHelper(root.right, result);
    }

    public List<Integer> inTraverse(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        inTraverseHelper(root, list);
        return list;
    }

    private void inTraverseHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inTraverseHelper(root.left, result);
        result.add(root.val);
        inTraverseHelper(root.right, result);
    }
}
