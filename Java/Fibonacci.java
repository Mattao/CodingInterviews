/**
 *	一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 *	PS: f(1) = 1, f(2) = 2  ... f(n)时,可以从f(n-1)跳一级或f(n-2)跳两级
 *		f(n) = f(n-1) + f(n-2)
 *
 *	Author: matao
 */

public class Fibonacci {
	public static long fib(int n) {
		if(n <= 0) {
			return 0;
		}
		if(n == 1 ) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		long[] result = new long[n+1];
		result[1] = 1;
		result[2] = 1;
		for (int i = 3; i <= n; i++) {
			result[i] = result[i-1] + result[i-2];
		}
		return result[n];
	}

	public static void main(String[] args) {
		System.out.println(fib(3));
		System.out.println(fib(10));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(100));
	}
}