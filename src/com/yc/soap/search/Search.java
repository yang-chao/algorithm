package com.yc.soap.search;

/**
 * Created by yc-mac on 15/10/13.
 */
public class Search {
    public static void main(String[] args) {
        int[] a = {1, 9, 99};
        int target = 1;
        System.out.println(search(a, target));
    }


    public static int search(int[] array, int target) {
        //write your code here
        if (array == null || array.length == 0) {
            return -1;
        }
        return binarySearch(array, 0, array.length - 1, target);
    }

    public static int binarySearch(int[] array, int low, int high, int target) {
        if (low <= high) {
            int middle = (low + high) / 2;
            if (target == array[middle]) {
                return middle;
            } else if (target < array[middle]) {
                return binarySearch(array, low, middle - 1, target);
            } else {
                return binarySearch(array, middle + 1, high, target);
            }
        }
        return -1;
    }
}


