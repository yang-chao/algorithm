package com.yc.soap;

/**
 * Created by yc-mac on 15/8/29.
 */
public class QuickSort extends Sort {

    @Override
    public void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = partition(a, low, high);
        sort(a, low, middle - 1);
        sort(a, middle + 1, high);
    }

    private int partition(Comparable[] a, int low, int high) {
        int i = low;
        int j = high + 1;
        Comparable v = a[low];
        while (true) {
            while (less(a[++i], v)) {
                if (i == high) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, low, j);
        return j;
    }

    // 螺母和螺栓。有N个螺母和N个螺栓，每个螺母的大小都不同，每个螺栓的大小也都不同，
    // 对每个螺母有且仅有一个螺栓与它对应。每次你可以拿起一个螺母和一个螺栓比较，看看是否匹配，如果不匹配，显然你可以知道哪个大哪个小。
    // 但是不允许直接比较两个螺母或两个螺栓。现要求用最少的比较次数找出对应关系。
    public int partition(Comparable[] a, Comparable pivot, int low, int high) {
        int i = low - 1;
        int j = high + 1;
        while (true) {
            while (less(a[++i], pivot)) {
                if (i == high) {
                    break;
                }
            }
            while (less(pivot, a[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
            if (a[j] == pivot) {
                j++;
            }
            if (a[i] == pivot) {
                i--;
            }
        }
        return j;
    }

    public void sort(Comparable[] a, Comparable[] b, Comparable pivot, int low, int high, int lowB, int highB) {
        if (low >= high || lowB >= highB) {
            return;
        }
        int i = partition(a, pivot, low, high);
        int j = partition(b, a[i], lowB, highB);
        System.out.println(i + " - " + a[i] + " - " + b[j]);
        sort(a, b, b[lowB], low, i - 1, lowB, j - 1);
        sort(a, b, b[j + 1], i + 1, high, j + 1, highB);
    }

    public void exercise1(Comparable[] a, Comparable[] b) {
        sort(a, b, b[0], 0, a.length - 1, 0, b.length - 1);
    }
}
