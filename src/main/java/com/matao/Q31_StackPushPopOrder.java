package com.matao;

import java.util.LinkedList;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 输入两个整数序列，第一个序列表示栈的压入顺序，判断第二个序列是否为该栈的弹出序序列。
 * 假设压入栈的所有数字均不相等。例如，压入序列为(1,2,3,4,5)，序列(4,5,3,2,1)是它的弹出序列，而(4,3,5,1,2)不是。
 */
public class Q31_StackPushPopOrder {

    public boolean isPopOrder(int[] pushSeq, int[] popSeq) {
        if (pushSeq == null || popSeq == null || pushSeq.length != popSeq.length) {
            return false;
        }

        LinkedList<Integer> stack = new LinkedList<>();
        int pushIndex = 0, popIndex = 0;
        while (popIndex < popSeq.length) {
            if (stack.isEmpty() || stack.peek() != popSeq[popIndex]) {
                if (pushIndex < pushSeq.length) {
                    stack.push(pushSeq[pushIndex++]);
                } else {
                    return false;
                }
            } else {
                stack.pop();
                popIndex++;
            }
        }
        return true;
    }
}
