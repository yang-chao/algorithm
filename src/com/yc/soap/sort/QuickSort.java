package com.yc.soap.sort;

/**
 * Created by yc-mac on 15/8/29.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 1, 3, 10, 9, 8, 2, 4, 6, -1, 0};
//        int[] array = {4,2,4,1,4,2};
        quickSort1(array, 0, array.length - 1);
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
            if (low < high) {
                array[low] = array[high];
            }

            while (low < high && array[low] <= pivot) {
                low++;
            }
            if (low < high) {
                array[high] = array[low];
            }
        }
        array[low] = pivot;
        return low;
    }

    private static void quickSort1(int[] array, int low, int high) {
        int start = low;
        int end = high;
        if (low < high) {
            int pivot = array[low];
            while (low < high) {
                while (low < high && array[high] >= pivot) {
                    high--;
                }
                if (low < high) {
                    array[low] = array[high];
                }

                while (low < high && array[low] <= pivot) {
                    low++;
                }
                if (low < high) {
                    array[high] = array[low];
                }
            }
            array[low] = pivot;

            quickSort(array, start, low - 1);
            quickSort(array, low + 1, end);
        }
    }
}
