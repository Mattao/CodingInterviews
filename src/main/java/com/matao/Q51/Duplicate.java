package com.matao.Q51;

/**
 * Created by matao on 10/20/16.
 * <p>
 * 在一个长度是n的数组里的所有数字都在0到n-1范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * <p>
 * input: {2, 3, 1, 0, 2, 5, 3}
 * output: 2或3都行
 * <p>
 * 题目里写了数组里数字的范围保证在0 ~ n-1 之间，所以可以利用现有数组设置标志，
 * 当一个数字被访问过后，可以设置对应位上的数 + n，
 * 之后再遇到相同的数时，会发现对应位上的数已经大于等于n了，那么直接返回这个数即可。
 */
public class Duplicate {

    public int duplicate(int[] numbers) {
        // TODO: 10/20/16
        return -1;
    }

    public static void main(String[] args) {

    }

}

