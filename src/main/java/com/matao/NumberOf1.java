package com.matao;
/**
 *	输入一个整数n，求从1 到 n这n个整数的十进制表示中1出现的次数。
 *	例如： 输入12， 从1到12中包含1的数字的有1， 10， 11， 12， 共出现5次。
 *
 *	Author: matao
 */

public class NumberOf1 {
	public static int NumberOf1Between1AndN(int n) {
		int count = 0;
    	for (int i = 1; i <= n; i++) {
    		count += CountOf1(i);
    	}
    	return count;
    }

    public static int CountOf1(int n) {
    	int count = 0;
    	while(n != 0) {
    		if (n % 10 == 1) {
    			count++;
    		}
    		n /= 10;
    	}
    	return count;
    }

    public static void main(String[] args) {
    	System.out.println(NumberOf1Between1AndN(12));
    }
}