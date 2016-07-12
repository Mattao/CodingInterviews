package com.matao;
/**
 *	输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 *	Author: matao
 *
 *	n & (n-1)  可以去掉n的二进制表示中的最后一个是1的位置
 *
 */
public class NumberOf1InBinary {
	public static int numberOf1(int n) {
		int count = 0;
		while(n != 0) {
			count++;
			n &= (n-1);
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(numberOf1(1));
		System.out.println(numberOf1(-1));
		System.out.println(numberOf1(12));
		System.out.println(numberOf1(-3));
		System.out.println(numberOf1(0));
	}
}