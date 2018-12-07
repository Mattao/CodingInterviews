package com.matao.extra;

import com.matao.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matao on 2018-12-07.
 */
public class TraversalOfBinaryTreeTest {

    private TraversalOfBinaryTree traversalOfBinaryTree;
    private TreeNode<Integer> head;

    @BeforeEach
    void setUp() {
        traversalOfBinaryTree = new TraversalOfBinaryTree();

        /**
         * <pre>
         *          20
         *         /  \
         *       10    30
         *        \
         *         5
         * </pre>
         */
        TreeNode<Integer> node20 = new TreeNode<>(20);
        TreeNode<Integer> node10 = new TreeNode<>(10);
        TreeNode<Integer> node30 = new TreeNode<>(30);
        TreeNode<Integer> node5 = new TreeNode<>(5);

        node20.left = node10;
        node20.right = node30;
        node10.right = node5;

        head = node20;
    }

    @Test
    void testPreOrderRecursively() {
        List<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(10);
        expected.add(5);
        expected.add(30);

        Assertions.assertIterableEquals(expected, traversalOfBinaryTree.preOrderRecursively(head));
    }

    @Test
    void testPreOrderIteratively() {
        List<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(10);
        expected.add(5);
        expected.add(30);

        Assertions.assertIterableEquals(expected, traversalOfBinaryTree.preOrderIteratively(head));
    }

    @Test
    void testInOrderRecursively() {
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(5);
        expected.add(20);
        expected.add(30);

        Assertions.assertIterableEquals(expected, traversalOfBinaryTree.inOrderRecursively(head));
    }

    @Test
    void testInOrderIteratively() {
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        expected.add(5);
        expected.add(20);
        expected.add(30);

        Assertions.assertIterableEquals(expected, traversalOfBinaryTree.inOrderIteratively(head));
    }

    @Test
    void testPostOrderRecursively() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(10);
        expected.add(30);
        expected.add(20);

        Assertions.assertIterableEquals(expected, traversalOfBinaryTree.postOrderRecursively(head));
    }

    @Test
    void testPostOrderIteratively() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(10);
        expected.add(30);
        expected.add(20);

        Assertions.assertIterableEquals(expected, traversalOfBinaryTree.postOrderIteratively(head));
    }

    @Test
    void testLevelOrder() {
        List<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(10);
        expected.add(30);
        expected.add(5);

        Assertions.assertIterableEquals(expected, traversalOfBinaryTree.levelOrder(head));
    }
}
