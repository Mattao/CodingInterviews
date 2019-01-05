package com.matao;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 实现一个函数完成字符串的左旋转功能。比如，输入abcdefg和数字2，输出为cdefgab。
 * 三次翻转
 */
@SuppressWarnings("Duplicates")
public class Q58_LeftRotateString {

    public String leftRotate(String str, int n) {
        if (str == null || str.length() == 0) return str;

        n = n % str.length();

        StringBuilder builder = new StringBuilder(str);
        reverse(builder, 0, n - 1);
        reverse(builder, n, str.length() - 1);
        reverse(builder, 0, str.length() - 1);
        return builder.toString();
    }

    public void reverse(StringBuilder builder, int start, int end) {
        while (start < end) {
            char tmp = builder.charAt(start);
            builder.setCharAt(start, builder.charAt(end));
            builder.setCharAt(end, tmp);
            start++;
            end--;
        }
    }
}
