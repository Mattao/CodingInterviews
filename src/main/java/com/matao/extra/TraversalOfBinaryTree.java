package com.matao.extra;

import com.matao.common.TreeNode;

import java.util.*;

/**
 * Created by matao on 2018-12-07.
 * <p>
 * 二叉树的各种遍历
 */
public class TraversalOfBinaryTree {

    // 递归版前序遍历
    public List<Integer> preOrderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();

        if (node != null) {
            list.add(node.val);
            list.addAll(preOrderRecursively(node.left));
            list.addAll(preOrderRecursively(node.right));
        }

        return list;
    }

    // 迭代版前序遍历
    public List<Integer> preOrderIteratively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        TreeNode<Integer> currentNode = node;

        // stack栈顶元素永远为 currentNode 的父节点
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                list.add(currentNode.val);
                stack.push(currentNode);

                currentNode = currentNode.left;
            }

            if (!stack.isEmpty()) {
                currentNode = stack.pop().right;
            }
        }
        return list;
    }

    // 递归版中序遍历
    public List<Integer> inOrderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();

        if (node != null) {
            list.addAll(inOrderRecursively(node.left));
            list.add(node.val);
            list.addAll(inOrderRecursively(node.right));
        }

        return list;
    }

    // 迭代版中序遍历
    public List<Integer> inOrderIteratively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();

        TreeNode<Integer> currentNode = node;
        // stack栈顶元素永远为currentNode的父节点
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            if (!stack.isEmpty()) {
                list.add(stack.peek().val);
                currentNode = stack.pop().right;
            }
        }
        return list;
    }

    // 递归版后序遍历
    public List<Integer> postOrderRecursively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();

        if (node != null) {
            list.addAll(postOrderRecursively(node.left));
            list.addAll(postOrderRecursively(node.right));
            list.add(node.val);
        }

        return list;
    }

    // 迭代版后序遍历
    public List<Integer> postOrderIteratively(TreeNode<Integer> node) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> currentNode = node;
        TreeNode<Integer> preVisited = null;

        // stack栈顶元素永远为 currentNode 的父节点
        // preVisited 用于区分是从左子树还是右子树返回的
        while (currentNode != null || !stack.isEmpty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stack.peek().right;
                if (currentNode != null && currentNode != preVisited) {
                    stack.push(currentNode);
                    currentNode = currentNode.left;
                } else {
                    preVisited = stack.pop();
                    list.add(preVisited.val);
                    currentNode = null;
                }
            }
        }
        return list;
    }

    public List<Integer> levelOrder(TreeNode<Integer> node) {
        List<Integer> list = new LinkedList<>();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        TreeNode<Integer> currentNode = node;

        if (currentNode != null) {
            queue.offer(currentNode);
            while (!queue.isEmpty()) {
                currentNode = queue.poll();
                list.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return list;
    }
}
