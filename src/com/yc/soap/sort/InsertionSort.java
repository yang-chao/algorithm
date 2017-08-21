package com.yc.soap.sort;

/**
 * Created by yc-mac on 15/8/24.
 */
public class InsertionSort extends Sort {

    @Override
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a, j, j - 1)) {
                    exch(a, j, j - 1);
                }
            }
        }
    }

    /**
     * Exercise 2.1.24
     */
    public void guardInsertionSort(Comparable[] a) {
        int N = a.length;
        int min = 0;
        for (int i = 1; i < N; i++) {
            if (less(a, i, min)) {
                min = i;
            }
        }
        exch(a, 0, min);
        for (int i = 2; i < N; i++) {
            for (int j = i; less(a, j, j - 1); j--) {
                exch(a, j, j -1);
            }
        }
    }
}
