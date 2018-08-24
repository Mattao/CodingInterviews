package com.matao;

/**
 * Created by matao on 2018/8/24.
 * <p>
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Q04_FindInPartiallySortedMatrix {

    // 从左下角往右上角扫,或从右上角往所下角扫
    public static boolean findInPartiallySortedMatrix(int[][] data, int target) {
        if (data == null || data.length == 0 || data[0].length == 0) {
            return false;
        }

        int rows = data.length, columns = data[0].length;
        int i = rows - 1, j = 0;
        while (i >= 0 && j < columns) {
            if (data[i][j] < target) {
                j++;
            } else if (data[i][j] > target) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] data = {
            {1, 2, 8, 9},
            {2, 4, 9, 12},
            {4, 7, 10, 13},
            {6, 8, 11, 15}
        };
        System.out.println(findInPartiallySortedMatrix(data, 10));
        System.out.println(findInPartiallySortedMatrix(data, 5));
    }
}
