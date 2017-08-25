package com.yc.soap.array;

/**
 * 输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 */
public class MaxSum {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 10, -4, 7, 2, -5, 6};
        System.out.println(findMaxSum(array));
    }

    private static int findMaxSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length;i++) {
            if (sum <= 0) {
                sum = array[i];
            } else {
                sum += array[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
