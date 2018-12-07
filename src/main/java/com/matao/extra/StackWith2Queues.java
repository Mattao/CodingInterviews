package com.matao.extra;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by matao on 2018-12-07.
 * <p>
 * 用两个队列，实现栈的 push 和 pop
 */
@SuppressWarnings("Duplicates")
public class StackWith2Queues<E> {

    private Queue<E> queue1 = new LinkedList<>();
    private Queue<E> queue2 = new LinkedList<>();

    public void push(E item) {
        if (!queue2.isEmpty()) {
            queue2.offer(item);
        } else {
            queue1.offer(item);
        }
    }

    public E pop() {
        if (!queue2.isEmpty()) {
            int size = queue2.size();
            // 保留最后入队的元素
            for (int i = 0; i < size - 1; i++) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        } else if (!queue1.isEmpty()) {
            int size = queue1.size();
            for (int i = 0; i < size - 1; i++) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        } else {
            throw new EmptyStackException();
        }
    }

}
