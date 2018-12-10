package com.matao;

import com.matao.common.TreeNode;
import com.matao.extra.TraversalOfBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created by matao on 2018-12-10.
 */
public class Q07_ConstructBinaryTreeTest {

    private Q07_ConstructBinaryTree constructBinaryTree;
    private TraversalOfBinaryTree traversalOfBinaryTree;

    @BeforeEach
    void setUp() {
        constructBinaryTree = new Q07_ConstructBinaryTree();
        traversalOfBinaryTree = new TraversalOfBinaryTree();
    }

    /**
     * Normal Binary Tree
     * <pre>
     *              1
     *           /     \
     *          2       3
     *         /       / \
     *        4       5   6
     *         \         /
     *          7       8
     * </pre>
     */
    @Test
    void testNormalBinaryTree() {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = constructBinaryTree.constructBinaryTree(pre, in);

        List<Integer> preTraverseList = traversalOfBinaryTree.preOrderRecursively(root);
        List<Integer> inTraverseList = traversalOfBinaryTree.inOrderRecursively(root);

        Assertions.assertArrayEquals(pre, preTraverseList.stream().mapToInt(Integer::intValue).toArray());
        Assertions.assertArrayEquals(in, inTraverseList.stream().mapToInt(Integer::intValue).toArray());
    }

    /**
     * 所有结点都没有右子结点
     * <pre>
     *              1
     *             /
     *            2
     *           /
     *          3
     *         /
     *        4
     *       /
     *      5
     * </pre>
     */
    @Test
    void testNoneRightBinaryTree() {
        int[] pre = {1, 2, 3, 4, 5};
        int[] in = {5, 4, 3, 2, 1};

        TreeNode root = constructBinaryTree.constructBinaryTree(pre, in);

        List<Integer> preTraverseList = traversalOfBinaryTree.preOrderRecursively(root);
        List<Integer> inTraverseList = traversalOfBinaryTree.inOrderRecursively(root);

        Assertions.assertArrayEquals(pre, preTraverseList.stream().mapToInt(Integer::intValue).toArray());
        Assertions.assertArrayEquals(in, inTraverseList.stream().mapToInt(Integer::intValue).toArray());
    }

    /**
     * 所有结点都没有右子结点
     * <pre>
     *     1
     *      \
     *       2
     *        \
     *         3
     *          \
     *           4
     *            \
     *             5
     * </pre>
     */
    @Test
    void testNoneLeftBinaryTree() {
        int[] pre = {1, 2, 3, 4, 5};
        int[] in = {1, 2, 3, 4, 5};

        TreeNode root = constructBinaryTree.constructBinaryTree(pre, in);

        List<Integer> preTraverseList = traversalOfBinaryTree.preOrderRecursively(root);
        List<Integer> inTraverseList = traversalOfBinaryTree.inOrderRecursively(root);

        Assertions.assertArrayEquals(pre, preTraverseList.stream().mapToInt(Integer::intValue).toArray());
        Assertions.assertArrayEquals(in, inTraverseList.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    void testRootOnlyBinaryTree() {
        int[] pre = {1};
        int[] in = {1};

        TreeNode root = constructBinaryTree.constructBinaryTree(pre, in);

        List<Integer> preTraverseList = traversalOfBinaryTree.preOrderRecursively(root);
        List<Integer> inTraverseList = traversalOfBinaryTree.inOrderRecursively(root);

        Assertions.assertArrayEquals(pre, preTraverseList.stream().mapToInt(Integer::intValue).toArray());
        Assertions.assertArrayEquals(in, inTraverseList.stream().mapToInt(Integer::intValue).toArray());
    }

    /**
     * Complete Binary Tree
     * <pre>
     *              1
     *           /     \
     *          2       3
     *         / \     / \
     *        4   5   6   7
     * </pre>
     */
    @Test
    void testCompleteBinaryTree() {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] in = {4, 2, 5, 1, 6, 3, 7};

        TreeNode root = constructBinaryTree.constructBinaryTree(pre, in);

        List<Integer> preTraverseList = traversalOfBinaryTree.preOrderRecursively(root);
        List<Integer> inTraverseList = traversalOfBinaryTree.inOrderRecursively(root);

        Assertions.assertArrayEquals(pre, preTraverseList.stream().mapToInt(Integer::intValue).toArray());
        Assertions.assertArrayEquals(in, inTraverseList.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    void testNull() {
        TreeNode root = constructBinaryTree.constructBinaryTree(null, null);
        Assertions.assertNull(root);
    }
}
