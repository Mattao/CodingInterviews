package com.matao.Q6;

import com.matao.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ConstructBinaryTreeTest {

    private ConstructBinaryTree constructBinaryTree;

    @BeforeEach
    void setUp() {
        constructBinaryTree = new ConstructBinaryTree();
    }

    /**
     *  Normal Binary Tree
     *              1
     *           /     \
     *          2       3
     *         /       / \
     *        4       5   6
     *         \         /
     *          7       8
     */
    @Test
    void testNormalBinaryTree() {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = constructBinaryTree.reConstructBinaryTree(pre, in);

        List<Integer> preTraverseList = constructBinaryTree.preTraverse(root);
        List<Integer> inTraverseList = constructBinaryTree.inTraverse(root);

        Assertions.assertArrayEquals(pre, preTraverseList.stream().mapToInt(Integer::intValue).toArray());
        Assertions.assertArrayEquals(in, inTraverseList.stream().mapToInt(Integer::intValue).toArray());
    }
}
