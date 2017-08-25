package com.yc.soap.sort;

/**
 * 输入n个整数，找出其中最小的k个数。
 */
public class MinK {
    public static void main(String[] args) {
        int[] array = {1,5,3,10,9,8,4,7,2,6};
        findMinK(array, 5, 0, array.length - 1);
    }

    private static void findMinK(int[] array, int k, int low, int high) {
        if (array == null || array.length == 0 || k <= 0) {
            return;
        }
        int p = partition(array, low, high);
        if (p == k) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ",");
            }
            System.out.println();
            for (int i = 0; i < k; i++) {
                System.out.print(array[i] + ",");
            }
        } else if (p > k) {
            findMinK(array, k, low, p - 1);
        } else {
            findMinK(array, k, p + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        while (low < high) {
            while (low < high && array[high] >= pivot) {
                high--;
            }
            array[low] = array[high];

            while (low < high && array[low] <= pivot) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = pivot;
        return low;
    }
}
