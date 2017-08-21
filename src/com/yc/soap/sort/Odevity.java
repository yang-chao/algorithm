package com.yc.soap.sort;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class Odevity {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array = {2, 2, 2, 2, 6, 9, 11, 12, 1, 3, 5, 7, 9, 10};
        sort(array);
        print(array);
    }

    private static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int low = 0;
        int high = array.length - 1;
        int temp;
        while (low < high) {
            while (low < high && array[low] % 2 != 0) {
                low++;
            }
            while (low < high && array[high] % 2 == 0) {
                high--;
            }
            if (low < high) {
                temp = array[high];
                array[high] = array[low];
                array[low] = temp;
            }
        }
    }

    private static void print(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int n = 0;
        while (n < array.length) {
            System.out.print(array[n]);
            System.out.print(",");
            n++;
        }
    }
}
