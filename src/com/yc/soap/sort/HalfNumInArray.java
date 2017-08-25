package com.yc.soap.sort;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 */
public class HalfNumInArray {
    public static void main(String[] args) {
        int[] array = {2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(findNumOverHalf(array, 0, array.length - 1));
    }

    private static int findNumOverHalf(int[] array, int low, int high) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int p = partition(array, low, high);
        int mid = (array.length - 1) / 2;

        while (mid != p) {
            if (p > mid) {
                p = partition(array, low, p - 1);
            } else {
                p = partition(array, p + 1, high);
            }
        }
        return array[mid];
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
