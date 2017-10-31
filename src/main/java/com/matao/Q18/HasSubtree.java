package com.matao.Q18;

import com.matao.common.TreeNode;

/**
 * Created by matao on 10/26/16.
 * <p>
 * 输入两颗二叉树A和B，判断B是不是A的子结构
 */
public class HasSubtree {

    public static boolean hasSub(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = hasSub(root1, root2);
            }
            if (!result) {
                result = hasSub(root1.left, root2.left);
            }
            if (!result) {
                result = hasSub(root1.right, root2.right);
            }
        }
        return result;
    }

    public static boolean tree1HasTree2(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }

        if (root1 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        return tree1HasTree2(root1.left, root2.left)
                && tree1HasTree2(root1.right, root2.right);

    }

    public static void main(String[] args) {

    }
}
