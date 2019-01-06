package com.matao;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的min函数。要求在该栈中，调用min，push及pop的时间复杂度都是o(1)。
 * <p>
 * 自己实现一个栈，栈中有记录数据的数据栈，同时也有记录最小值的min栈, min栈中的数据总是记录当前数据栈的最小值。
 */
public class Q30_StackWithMin<E extends Comparable> {

    private LinkedList<E> dataStack = new LinkedList<>();
    private LinkedList<E> minStack = new LinkedList<>();

    public void push(E item) {
        if (dataStack.isEmpty()) {
            dataStack.push(item);
        } else {
            E tmp = dataStack.peek();
            if (tmp.compareTo(item) < 0) {
                minStack.push(tmp);
            } else {
                minStack.push(item);
            }
        }
    }

    public E pop() {
        if (dataStack.isEmpty()) {
            throw new EmptyStackException();
        } else {
            minStack.pop();
            return dataStack.pop();
        }
    }

    public E min() {
        if (minStack.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return minStack.peek();
        }
    }

}
