package com.matao;

import com.matao.common.InvalidParameterException;

/**
 * Created by matao on 2018-12-10.
 * <p>
 * 把一个数组最开始的若干个元素搬到末尾成为数组的旋转，如:
 * 1 2 3 4 5 => 3 4 5 1 2
 * 0 1 1 1 1 => 1 1 1 0 1
 * 0 1 1 1 1 => 1 0 1 1 1
 * 求一个原本递增的数组旋转后的最小数字。
 */
public class Q11_MinNumberInRotatedArray {

    /**
     * 二分查找。
     * 原本有序，进行了旋转，但在一定程度上还是有序的。
     */
    public int min(int[] array) {
        if (array == null || array.length == 0) {
            throw new InvalidParameterException("array cannot be null or empty");
        }

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (array[mid] > array[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return array[start];
    }
}
