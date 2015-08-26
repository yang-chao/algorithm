package com.yc.soap;

public class Main {

    public static void main(String[] args) {
        Integer[] a = {4, 6, 19, 3, 7, 10, 1, 5, 23, 16, 88, 0, 11, 1, 9, 12};

//        Sort sort = new ShellSort();
//        sort.sort(a);
//        sort.printArray(a);
//        System.out.println("Array a is sorted: " + sort.isSorted(a));

//        Sort sort = new InsertionSort();
//        sort.sort(a);
//        sort.printArray(a);
//        System.out.println("Array a is sorted: " + sort.isSorted(a));

//        ((InsertionSort) sort).guardInsertionSort(a);
//        sort.printArray(a);

        // Sort sort = new SelectionSort();
        // sort.sort(a);
        // sort.printArray(a);

        MergeSort sort = new MergeSort();
        sort.sort(a);
        sort.printArray(a);
    }
}
