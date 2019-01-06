package com.matao;

import java.util.Arrays;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 找出n个整数中最小的k个数。例如输入4,5,1,6,2,7,3,8，则最小的4个数字是1,2,3,4。
 */
@SuppressWarnings("Duplicates")
public class Q40_KLeastNumbers {

    public int getLeastNumbers(int[] data, int k) {
        if (data == null || data.length == 0 || k > data.length) {
            return Integer.MIN_VALUE;
        }
        int left = 0, right = data.length - 1;
        int index = partition(data, left, right);
        while (index != k - 1) {
            if (index < k - 1) {
                index = partition(data, index + 1, right);
            } else {
                index = partition(data, left, index - 1);
            }
        }

        System.out.println(Arrays.toString(data));
        return data[k - 1];
    }

    private int partition(int[] data, int left, int right) {
        int pivotIndex = left;
        int pivot = data[pivotIndex];
        while (left < right) {
            while (left < right && data[right] >= pivot) right--;
            while (left < right && data[left] <= pivot) left++;
            if (left < right) {
                swap(data, left, right);
            }
        }
        swap(data, pivotIndex, left);
        return left;
    }

    private void swap(int[] data, int from, int to) {
        int tmp = data[from];
        data[from] = data[to];
        data[to] = tmp;
    }
}
