package com.yc.soap;

public class Main {

    public static void main(String[] args) {
        Integer[] a = {4, 6, 19, 3, 7, 10, 1, 5, 23, 16, 88, 0, 11, 1, 9, 12};

        Sort shellSort = new ShellSort();
        shellSort.sort(a);
        shellSort.printArray(a);
    }
}
