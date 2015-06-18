/**
 *	数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *	例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，
 *	因此输出2。没有找到输出为0。
 *
 *	Author: matao
 */

public class MoreThanHalfNumber {
	// 用partion方法进行划分，知道找到中位数，再判断中位数是否出现次数是否超过数组长度的一半
	public static int getMoreThanHalfNum1(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int left = 0, right = array.length - 1;
		int mid = array.length / 2;
		int index = partion(array, left, right);
		while(index != mid) {
			if (index > mid) {
				right = index - 1;
				index = partion(array, left, right);
			} else {
				left = index + 1;
				index = partion(array, left, right);
			}
		}

		// 找到中位数后，判断其是不是超过数组长度的一半
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[index]) {
				times++;
			}
		}
		if (times * 2 <= array.length) {
			return 0;
		}

		return array[index];
	}

	public static int partion(int[] array, int left, int right) {
		int pivot = array[left];
		int i = left, j = right;
		while(i < j) {
			while(i < j && array[j] >= pivot) j--;
			while(i < j && array[i] <= pivot) i++;
			if (i < j) {
				swap(array, i, j);
			}
		}
		array[left] = array[i];
		array[i] = pivot;
		return i;
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

// --------------------------------

	public static int getMoreThanHalfNum2(int[] array) {
		if(array == null || array.length == 0) {
            return 0;
        }
        int result = array[0];
        int times = 1;
        for(int i = 1; i < array.length; i++) {
            if(times == 0) {
                result = array[i];
                times = 1;
            }
            if(array[i] == result) {
                times++;
            } else {
                times--;
            }
        }
        
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == result) {
                count++;
            }
        }
        if(count * 2 <= array.length) {
            return 0;
        }
        return result;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 1, 5, 1};
		System.out.println(getMoreThanHalfNum2(array));
		System.out.println(getMoreThanHalfNum1(array));
	}
}