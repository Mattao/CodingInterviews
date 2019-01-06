package com.matao;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 实现一个函数来调整数组中的数字，使得所有奇数位于数组的前半部分，偶数位于后半部分。
 */
public class Q21_ReorderArray {

    public int[] reorder(int[] data) {
        if (data == null || data.length < 2) return data;

        int left = 0, right = data.length - 1;
        while (left < right) {
            while (left < right && !isEven(data[left])) {
                left++;
            }
            while (left < right && isEven(data[right])) {
                right--;
            }
            if (left < right) {
                int tmp = data[left];
                data[left] = data[right];
                data[right] = tmp;
            }
        }
        return data;
    }

    private boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
