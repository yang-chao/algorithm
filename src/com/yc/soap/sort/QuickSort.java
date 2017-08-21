package com.yc.soap.sort;

/**
 * Created by yc-mac on 15/8/29.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 1, 3, 10, 9, 8, 2, 4, 6};
        quickSort(array, 0, array.length - 1);
        for (int a :
                array) {
            System.out.print(a);
            System.out.print(",");
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
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
