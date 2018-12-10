package com.matao;

import com.matao.common.TreeNodeWithParent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by matao on 2018-12-10.
 */
public class Q08_NextNodeInBinaryTreesTest {

    private Q08_NextNodeInBinaryTrees nextNodeInBinaryTrees;
    private TreeNodeWithParent<Integer> root;
    private TreeNodeWithParent<Integer> node2;
    private TreeNodeWithParent<Integer> node3;
    private TreeNodeWithParent<Integer> node4;
    private TreeNodeWithParent<Integer> node5;
    private TreeNodeWithParent<Integer> node6;
    private TreeNodeWithParent<Integer> node7;
    private TreeNodeWithParent<Integer> node8;
    private TreeNodeWithParent<Integer> node9;

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
     * </pre>
     */
    @BeforeEach
    void setUp() {
        nextNodeInBinaryTrees = new Q08_NextNodeInBinaryTrees();
        root = new TreeNodeWithParent<>(1);
        node2 = new TreeNodeWithParent<>(2);
        node3 = new TreeNodeWithParent<>(3);
        node4 = new TreeNodeWithParent<>(4);
        node5 = new TreeNodeWithParent<>(5);
        node6 = new TreeNodeWithParent<>(6);
        node7 = new TreeNodeWithParent<>(7);
        node8 = new TreeNodeWithParent<>(8);
        node9 = new TreeNodeWithParent<>(9);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node8;
        node5.right = node9;
        node3.left = node6;
        node3.right = node7;

        node4.parent = node2;
        node2.parent = root;
        node8.parent = node5;
        node9.parent = node5;
        node5.parent = node2;
        node6.parent = node3;
        node7.parent = node3;
        node3.parent = root;
    }

    @Test
    void test() {
        Assertions.assertEquals(node9, nextNodeInBinaryTrees.getNext(node5));
        Assertions.assertEquals(node2, nextNodeInBinaryTrees.getNext(node4));
        Assertions.assertEquals(node5, nextNodeInBinaryTrees.getNext(node8));
        Assertions.assertEquals(root, nextNodeInBinaryTrees.getNext(node9));
        Assertions.assertNull(nextNodeInBinaryTrees.getNext(node7));
    }

}
