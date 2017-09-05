package com.yc.soap.test;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array == null) {
            return 0;
        }
        quickSort(array, 0, array.length - 1);
        int low = 0;
        int high = array.length - 1;
        int mid = array[(low + high) / 2];

        int count = 0;
        for (int i = 0; i <= high; i++) {
            if (array[i] == mid) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return mid;
        }
        return 0;
    }

    public static void quickSort(int[] array, int low, int high) {
        int start = low;
        int end = high;
        if (low < high) {
            int pivot = array[low];
            while(low < high) {
                while(low < high && array[high] >= pivot) {
                    high--;
                }
                if (low < high) {
                    array[low] = array[high];
                }

                while(low < high && array[low] <= pivot) {
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
