package com.yc.soap.sort;

import com.yc.soap.sort.Sort;

/**
 * Created by yc-mac on 15/8/24.
 */
public class SelectionSort extends Sort {

    @Override
    public void sort(Comparable[] a) {
        int min;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a, j, min)) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
