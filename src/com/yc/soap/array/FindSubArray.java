package com.yc.soap.array;

/**
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，得它们的和正好是s。如果有多对数字的和等于s，输出任意一对即可。
 */
public class FindSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        findSubArray(array, 10);
    }

    private static void findSubArray(int[] array, int s) {
        if (array == null) {
            return;
        }
        int low = 0;
        int high = array.length - 1;
        int sum;
        while (low < high) {
            sum = array[low] + array[high];
            if (sum == s) {
                System.out.println(array[low] + "," + array[high]);
                return;
            } else if (sum < s) {
                low++;
            } else {
                high--;
            }
        }
    }
}
