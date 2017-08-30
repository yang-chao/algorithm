package com.yc.soap.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(array, 10));
        System.out.println(binarySearch(array, 11, 0, array.length - 1));
    }

    private static int binarySearch(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                return binarySearch(array, key, low, mid - 1);
            } else {
                return binarySearch(array, key, mid + 1, high);
            }
        }
        return -1;
    }
}
