/**
 *	输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 *	   所有的偶数位于位于数组的后半部分
 *
 *	若要保证奇数和奇数，偶数和偶数之间的相对位置不变呢？
 *
 *	Author: matao
 */

public class ReorderArray {
	//相对位置可变
	public static void reorderOddEven1 (int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		int i = 0, j = array.length - 1;
		while(i < j) {
			while(i < j && (array[j] & 1) == 0) {
				j--;
			}
			while(i < j && (array[i] & 1) == 1) {
				i++;
			}
			if(i < j) {
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
			}
		}
	}

	// 相对位置不变
	public static void reorderOddEven2 (int[] array) {
		if(array == null || array.length == 0) {
			return;
		}
		for (int i = 0; i < array.length; i++) {
			if((array[i] & 1) == 1) {
				int tmp = array[i];
				int j = i-1;
				while(j >= 0 && (array[j] & 1) == 0) {
					array[j+1] = array[j];
					j--;
				}
				array[++j] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		reorderOddEven1(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();

		int[] array2 = {1, 2, 3, 4, 5};
		reorderOddEven2(array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
	}
}