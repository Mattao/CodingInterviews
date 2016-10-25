//package com.matao;
///**
// *	输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整数组成一个子数组。
// *	求所有子数组的和的最大值。要求时间复杂度O(n)
// *
// *	Author: matao
// */
//
//public class GreatestSumOfSubArrays {
//	// 滑动窗口
//	public static int findGreatestSumOfSubArray1(int[] array) {
//		if (array == null || array.length == 0) {
//			return 0;
//		}
//		int maxSum = Integer.MIN_VALUE;
//		int tempSum = 0;
//		for (int i = 0; i < array.length; i++) {
//			if(tempSum <= 0) {
//				tempSum = array[i];
//			} else {
//				tempSum += array[i];
//			}
//
//			if(tempSum > maxSum) {
//				maxSum = tempSum;
//			}
//		}
//		return maxSum;
//	}
//
//	// dynamic programming
//	// f[n] = f[n-1] + array[n]
//	//   or = array[n]
//	public static int findGreatestSumOfSubArray2(int[] array) {
//		if (array == null || array.length == 0) {
//			return 0;
//		}
//
//		int maxSum = Integer.MIN_VALUE;
//		int[] result = new int[array.length];
//		result[0] = array[0];
//		for (int i = 1; i < array.length; i++) {
//			result[i] = (result[i-1] + array[i]) > array[i] ? (result[i-1] + array[i]) : array[i];
//		}
//		for (int i = 0; i < result.length; i++) {
//			if (maxSum < result[i]) {
//				maxSum = result[i];
//			}
//		}
//		return maxSum;
//	}
//
//	public static void main(String[] args) {
//		int[] array1 = {1, -2, 3, 10, -4, 7, 2, -5};
//		int[] array2 = {6, -3, -2, 7, -15, 1, 2, 2};
//
//		System.out.println(findGreatestSumOfSubArray1(array1));
//		System.out.println(findGreatestSumOfSubArray1(array2));
//
//		System.out.println(findGreatestSumOfSubArray2(array1));
//		System.out.println(findGreatestSumOfSubArray2(array2));
//	}
//}