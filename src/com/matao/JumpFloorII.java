package com.matao;
/**
 *	一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *	
 *	f(1) = 1, 
 *	f(2) = f(1) + 1  从台阶1跳一级上来，或者直接跳两级上来
 *	f(3) = f(1) + f(2) + 1 	从台阶1跳两级上来，或从台阶2跳一级上来或直接跳上来
 *	...
 *	f(n) = f(1) + f(2) + ... + f(n-1) + 1
 *
 *	Author: matao	
 */

public class JumpFloorII {
	public static int jump(int n) {
		int[] result = new int[n + 1];    	
		result[1] = 1;
		for (int i = 2; i <= n; i++) {
			result[i] = 1;
			for (int j = 1; j < i; j++) {
				result[i] += result[j];
			}
		}
		return result[n];
    }

    public static void main(String[] args) {
    	System.out.println(jump(1));
    	System.out.println(jump(2));
    	System.out.println(jump(3));
    }
}