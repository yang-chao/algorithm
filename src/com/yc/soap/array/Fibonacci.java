package com.yc.soap.array;

/**
 * 斐波那契数列递归和非递归两种写法。
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci1(7));
        System.out.println(fibonacci2(7));
    }

    private static int fibonacci1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci1(n - 1) + fibonacci1(n - 2);
        }
    }

    private static int fibonacci2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fib0 = 0;
            int fib1 = 1;
            int fibN = 0;
            for (int i = 2; i <= n; i++) {
                fibN = fib0 + fib1;
                fib0 = fib1;
                fib1 = fibN;
            }
            return fibN;
        }
    }
}
