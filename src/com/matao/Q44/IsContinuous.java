package com.matao.Q44;

import java.util.Arrays;

/**
 * Created by matao on 10/03/2017.
 * 从扑克牌随机抽5张牌，判断是不是一个顺子，即是否连续。
 * 2 - 10 为数字本身。大小王可以看成任何数字,并且A看作1,J为11,Q为12,K为13
 */
public class IsContinuous {

    /**
     * 将大小王看成是0，用0区补空缺位置。如果5个数字中空缺个数小于等于0的个数，则仍然连续
     * 如果非零数字重复出现，则必定不是顺子。
     *
     * @param numbers
     * @return
     */
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            return false;
        }
        Arrays.sort(numbers);

        int numberOfZero = 0;
        int numberOfGap = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                ++numberOfZero;
            }
        }

        int small = numberOfZero;   // 第一个非零数字对应的index
        int big = small + 1;
        while (big < numbers.length) {
            if (numbers[small] == numbers[big]) {   // 有对子，肯定不是顺子
                return false;
            }

            // numbers[big] - numbers[small] - 1即两书间的gap
            numberOfGap += numbers[big] - numbers[small] - 1;
            small = big;
            ++big;
        }

        return numberOfZero >= numberOfGap ? true : false;
    }
}
