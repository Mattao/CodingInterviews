package com.matao;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 求买卖股票一次能获得的最大利润。例如，输入{9，11，8，5，7，12，16，14}，5的时候买入，16的时候卖出，则能获得最大利润11。
 */
public class Q63_MaximalProfit {

    /**
     * 遍历过程中记录最小值min，然后计算当前值与min的差值diff，并更新maxDiff，maxDiff=max(diff)。
     */
    public int maxDiff(int[] data) {
        if (data == null || data.length < 2) {
            return 0;
        }

        int min = data[0];
        int maxDiff = data[1] - min;

        if (data[1] < min) {
            min = data[1];
        }

        for (int i = 2; i < data.length; i++) {
            int diff = data[i] - min;
            maxDiff = maxDiff > diff ? maxDiff : diff;
            min = min < data[i] ? min : data[i];
        }

        return maxDiff;
    }
}
