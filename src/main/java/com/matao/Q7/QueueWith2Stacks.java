package com.matao.Q7;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * <p>
 * Author: matao
 */
public class QueueWith2Stacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueque(int node) {
        stack1.push(node);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new EmptyQueueException();
        }
        return stack2.pop();
    }

    public static class EmptyQueueException extends RuntimeException {

    }
}