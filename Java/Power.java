/**
 *	给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 *	Author: matao
 *
 *	1. 0的负数次方
 *	2. 负数次方的处理(正数次方的倒数)
 *	
 */

public class Power {
	public static double pow(double base, int exponent) {
		if (equal(base, 0.0) && exponent < 0) {
			return Double.POSITIVE_INFINITY;
		}
		int sign = 1;
		if (exponent < 0) {
			sign = -1;
			exponent = -exponent;
		}
		double result = powWithoutSigh(base, exponent);
		if(sign == -1) {
			result = 1.0 / result;
		}
		return result;
	}

	public static double powWithoutSigh(double base, int exponent) {
		double result = 1.0;
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;
	}

	// optimization
	public static double powWithoutSigh2(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		if (exponent == 1) {
			return base;
		}
		double result = powWithoutSigh2(base, exponent >> 1);
		result = result * result;
		if((exponent & 1) == 1) {  //奇数
			result *= base;
		}
		return result;
	}

	public static boolean equal(double num1, double num2) {
		if(((num1 - num2) > - 0.000001) && ((num1 - num2) < 0.000001)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(pow(3.0, 2));
		System.out.println(pow(3.0, -2));
		System.out.println(pow(3.0, 0));
	}
}