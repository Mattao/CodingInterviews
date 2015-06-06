/**
 *	在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *	请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *	Author: matao
 *
 */

// solution1: 从左下角往右上角扫
// solution2: 二维数组转一维数组，排序，再二分
public class FindInPartiallySortedMatrix {

	public static boolean Find(int[][] array, int target) {
		if(array == null || array.length == 0 || array[0].length == 0) {
			return false;
		}
		int row = array.length, columns = array[0].length;
		int i = row - 1, j = 0;
		while(i >= 0 && j < columns) {
			if (array[i][j] < target) {
				j++;
			} else if (array[i][j] > target) {
				i--;
			} else {
				return true;
			}
		}
		return false;
    }

	public static void main(String args[]) {
		int[][] array1 = new int[][]{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int[][] array2 = new int[][]{
			{2, 3, 4},
			{5, 6, 7},
			{8, 9, 10}
		};
		System.out.println(Find(array1, 5));
		System.out.println(Find(array2, 1));
		System.out.println(Find(array2, 12));
	}
}