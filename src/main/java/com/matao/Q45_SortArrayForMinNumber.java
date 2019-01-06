package com.matao;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 使其为所有可能的拼接结果中最小的一个。例如输入{3,32,321}，则输出321323。
 */
public class Q45_SortArrayForMinNumber {

    /**
     * 此题需要对数组进行排序，关键点在于排序的规则需要重新定义。
     * 我们重新定义“大于”，“小于”，“等于”。如果a，b组成的数字ab的值大于ba，则称a"大于"b，小于与等于类似。
     * 比如3与32，因为332大于323，因此我们称3“大于”32。
     * 我们按照上述的“大于”，“小于”规则进行升序排列，即可得到题目要求的答案。
     */
    public int minNumber(int[] data) {
        if (data == null || data.length == 0) return Integer.MIN_VALUE;

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (bigger(data[j], data[j + 1])) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int datum : data) {
            builder.append(datum + "");
        }
        return Integer.parseInt(builder.toString());
    }

    private boolean bigger(int a, int b) {
        String tmp1 = a + "" + b;
        String tmp2 = b + "" + a;
        if (tmp1.compareTo(tmp2) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
