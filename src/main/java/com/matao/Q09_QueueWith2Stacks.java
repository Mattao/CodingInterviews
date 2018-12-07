package com.matao;

import com.matao.common.EmptyQueueException;

import java.util.Stack;

/**
 * Created by matao on 2018-12-07.
 * <p>
 * 用两个栈，实现队列的从队尾插入元素 enqueue() 和从队头抛出元素 dequeue()
 */
public class Q09_QueueWith2Stacks<E> {

    private Stack<E> stack1 = new Stack<>();
    private Stack<E> stack2 = new Stack<>();

    public void enqueue(E item) {
        stack1.push(item);
    }

    public E dequeue() {
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
}
