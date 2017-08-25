package com.yc.soap.string;

import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
public class JoinInt {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
//        int[] array = {3, 32, 321};
        System.out.println(getMin(array));
    }

    static class StringComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            String a = String.valueOf(o1) + String.valueOf(o2);
            String b = String.valueOf(o2) + String.valueOf(o1);
            return a.compareTo(b);
        }
    }

    private static String getMin(int[] array) {
        if (array == null) {
            return "";
        }
        quickSort(array, 0, array.length - 1, new StringComparator());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }

    private static void quickSort(int[] array, int low, int high, Comparator<Integer> comparator) {
        if (low < high) {
            int pivot = array[low];
            int left = low;
            int right = high;
            while (low < high) {
                while (low < high && comparator.compare(array[high], pivot) >= 0) {
                    high--;
                }
                array[low] = array[high];

                while (low < high && comparator.compare(array[low], pivot) <= 0) {
                    low++;
                }
                array[high] = array[low];
            }
            array[low] = pivot;

            quickSort(array, left, low - 1, comparator);
            quickSort(array, low + 1, right, comparator);
        }
    }
}
