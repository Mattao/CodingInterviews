package com.matao.Q3;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * Author: matao
 */

// solution1: 从左下角往右上角扫,或从右上角往所下角扫
// solution2: 二维数组转一维数组，排序，再二分
public class FindInPartiallySortedMatrix {

    // 从左下角往右上角扫
    public boolean find(int[][] array, int target) {
        if (array == null || array.length == 0) {
            return false;
        }
        int rows = array.length, columns = array[0].length;
        if (rows > 0 && columns > 0) {
            int i = rows - 1, j = 0;
            while (i >= 0 && j < columns) {
                if (array[i][j] < target) {
                    j++;
                } else if (array[i][j] > target) {
                    i--;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
