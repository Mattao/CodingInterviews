/*
 *	输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 *	Author: matao
 */
import java.util.ArrayList;

public class KLeastNumbers {
	public static ArrayList<Integer> GetLeastNumbers(int[] array, int k) {
	 	ArrayList<Integer> result = new ArrayList<Integer>();
		if(array == null || array.length < k) {
			return result;
		}

		int left = 0, right = array.length - 1;
		int index = partion(array, left, right);
		while(index != k) {
			if (index > k) {
				right = index - 1;
				index = partion(array, left, right);
			} else {
				left = index + 1;
				index = partion(array, left, right);
			}
		}
		for (int i = 0; i < index; i++) {
			result.add(array[i]);
		}
		return result;
    }

    public static int partion(int[] array, int left, int right) {
    	int pivot = array[left];
    	int i = left, j = right;
    	while(i < j) {
    		while(i < j && array[j] >= pivot) j--;
    		while(i < j && array[i] <= pivot) i++;
    		if(i < j) {
    			int temp = array[i];
    			array[i] = array[j];
    			array[j] = temp;
    		}
    	}
    	array[left] = array[i];
    	array[i] = pivot;
    	return i;
    }

    public static void main(String[] args) {
    	int[] array = {4, 5, 1, 6, 2, 7, 3, 8};
    	ArrayList<Integer> result = GetLeastNumbers(array, 4);
    	for (Integer integer: result) {
    		System.out.print(integer + " ");
    	}
    	System.out.println();
    }
}