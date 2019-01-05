package com.matao;

/**
 * Created by matao on 2019-01-05.
 * <p>
 * 输入一个英文句子，翻转单词顺序，单词内字符不翻转，标点符号和普通字母一样处理。例如输入输入“I am a student.”，则输出“student. a am I”。
 */
public class Q58_ReverseWordsInSentence {

    /**
     * I am a student.
     * 首先字符串整体翻转得到 .tneduts a ma I
     * 以空格切分，对每个单词再次翻转 student. a ma I
     */
    public String reverse(String str) {
        if (str == null || str.length() == 0) return str;

        StringBuilder builder = new StringBuilder(str);
        reverseSubString(builder, 0, str.length() - 1);

        int start = 0;
        int end = builder.indexOf(" ");
        while (start < builder.length() && end != -1) {
            reverseSubString(builder, start, end - 1);
            start = end + 1;
            end = builder.indexOf(" ", start);
        }

        if (start < builder.length()) {
            reverseSubString(builder, start, builder.length() - 1);
        }
        return builder.toString();
    }

    /**
     * 翻转 StringBuilder[start, end]
     */
    private void reverseSubString(StringBuilder builder, int start, int end) {
        for (int i = start; i <= start + (end - start) / 2; i++) {
            char tmp = builder.charAt(i);
            builder.setCharAt(i, builder.charAt(end - i + start));
            builder.setCharAt(end - i + start, tmp);
        }
    }
}
