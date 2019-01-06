package com.matao;

import java.util.Arrays;

/**
 * Created by matao on 2019-01-06.
 * <p>
 * 找出数组中出现次数超过数组长度一半的数字。如输入{1,2,3,2,2,2,5,4,2}，则输出2。
 */
public class Q39_MoreThanHalfNumber {

    // 转化为 topK 问题（此处求第 k 小的值），
    public int moreThanHalfNum(int[] data) {
        if (data == null || data.length == 0) {
            return Integer.MIN_VALUE;
        }
        int left = 0, right = data.length - 1;
        int k = data.length / 2;
        int index = partition(data, left, right);
        while (index != k) {
            if (index > k) {
                index = partition(data, left, index - 1);
            } else {
                index = partition(data, index + 1, right);
            }
        }
        return data[k];
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
        System.out.println(Arrays.toString(data));
        return left;
    }

    private void swap(int[] array, int from, int to) {
        int tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }
}
