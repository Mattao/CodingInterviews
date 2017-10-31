package com.matao;

import java.util.Stack;

/**
 * Created by matao on 7/13/16.
 */
public class Test {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Test q = new Test();
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(5);
        System.out.println(q.pop());
        System.out.println(q.pop());
    }

}
