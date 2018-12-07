package com.matao;

import com.matao.common.InvalidParameterException;

/**
 * Created by matao on 2018-12-07.
 * <p>
 * 求斐波那契数列的第 n 项的值。
 * f(0) = 0
 * f(1) = 1
 * f(n) = f(n-1) + f(n-2), n > 1
 */
public class Q10_Fibonacci {

    public int fibRecursion(int n) {
        if (n < 0) {
            throw new InvalidParameterException("n must be greater than zero");
        }

        if (n == 0 || n == 1) return n;
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    public int fibIteration(int n) {
        if (n < 0) {
            throw new InvalidParameterException("n must be greater than zero");
        }

        if (n == 0 || n == 1) return n;

        int a = 0, b = 1;
        int i = 2;
        while (i <= n) {
            int temp = a + b;
            a = b;
            b = temp;

            i++;
        }
        return b;
    }
}
