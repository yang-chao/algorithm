package com.yc.soap;


/**
 * Created by yc-mac on 15/8/23.
 */
public abstract class Sort {

    public abstract void sort(Comparable[] a);

    protected boolean less(Comparable[] a, int i, int j) {
        return a[i].compareTo(a[j]) < 0;
    }

    protected void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void printArray(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }
}
