package com.matao;

import java.util.Arrays;

/**
 * Created by matao on 2018/8/24.
 * <p>
 * 一个长度为 n 的数组里所有数字都是在 0 - n-1 范围内。
 * 数组中某些数字重复，但不知道有几个数字重复了，也不知道重复次数。
 * 请找出数组中任意一个重复的数字。
 * input: { 2， 3， 1， 0， 2， 5， 3 }
 * output: 2 或 3
 */
@SuppressWarnings("Duplicates")
public class Q03_DuplicationInArray {

    /**
     * 暴力求解
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     */
    public int findDuplication1(int[] data) {
        if (data == null || data.length < 2) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0 || data[i] > data.length -1) {
                return -1;
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    return data[i];
                }
            }
        }
        return -1;
    }

    /**
     * 先进行排序，再一趟遍历。 会改变原数组顺序
     * 时间复杂度 O(nlogn)
     * 空间复杂度 O(1)
     */
    public int findDuplication2(int[] data) {
        if (data == null || data.length < 2) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0 || data[i] > data.length -1) {
                return -1;
            }
        }

        Arrays.sort(data);
        int prev = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] == prev) {
                return prev;
            } else {
                prev = data[i];
            }
        }
        return -1;
    }

    /**
     * 借助哈希原理，不会修改原始数据
     * n 的数组里所有数字都是在 0 - n-1 范围内, 该哈希解构总长度n，能容纳所有数字,
     * 一旦碰撞，则表示有重复数字。
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     */
    public int findDuplication3(int[] data) {
        if (data == null || data.length < 2) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0 || data[i] > data.length -1) {
                return -1;
            }
        }

        int[] hashTable = new int[data.length];
        for (int item : data) {
            if (hashTable[item] == 1) {
                return item;
            }
            hashTable[item] = 1;
        }
        return -1;
    }

    /**
     * 因为数组长度 n, 且数字都是在 0 - n-1 范围内,
     * 根据数字特点，那么重排序后，若没有重复的数字，数字 i 将出现在下标为 i 的位置。即 i == data[i]
     * 由于数组中有重复的数字，有些位置可能存在多个数字，同时有些位置可能没有数字。
     * 当 data[i] !== i 时候，则将 data[i] 交换到它应该出现的位置，即 data[data[i]]
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     */
    public int findDuplication4(int[] data) {
        if (data == null || data.length < 2) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0 || data[i] > data.length -1) {
                return -1;
            }
        }

        for (int i = 0; i < data.length; i++) {
            while (data[i] != i) {
                /**
                 *  pos     i   ... temp
                 *  value  temp     data[temp]
                 */
                int temp = data[i];
                if (temp == data[temp]) {
                    return temp;
                }
                data[i] = data[temp];
                data[temp] = temp;
            }
        }
        return -1;
    }

    /**
     * 二分的思路计数，不修改原始数据。
     * 1. n 个数字在 [0 - n-1] 的范围内，二分为[0, m] [m+1, n-1]
     * 2. 统计n个数字中出现在[0, m] 范围内的个数，若个数超过 m，则一定存在重复数字。
     * 否则重复数字一定是在[m+1, n-1]范围内
     *
     * 时间复杂度 O(nlogn)
     * 空间复杂度 O(1)
     */
    public int findDuplication5(int[] data) {
        if (data == null || data.length < 2) {
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0 || data[i] > data.length -1) {
                return -1;
            }
        }

        int start = 0, end = data.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = countRange(data, start, mid);
            if (start == end) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > (mid - start + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int countRange(int[] data, int start, int end) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (start <= data[i] && end >= data[i])
                count++;
        }
        return count;
    }
}
