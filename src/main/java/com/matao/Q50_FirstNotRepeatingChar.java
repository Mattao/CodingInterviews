package com.matao;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 字符串中第一个只出现一次的字符。在字符串中找出第一个只出现一次的字符。
 * 如输入 abaccdeff，则输出 b。
 */
public class Q50_FirstNotRepeatingChar {

    public char firstNotRepeatingChar(String str) {
        if (str == null) return '\77';

        int[] times = new int[256]; // str 仅包含 ASCII 字符
        for (int i = 0; i < str.length(); i++) {
            times[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (times[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\77';
    }
}
