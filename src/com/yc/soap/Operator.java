package com.yc.soap;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用＋、－、×、÷四则运算符号。
 */
public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 28;
        System.out.println(add(a, b));
    }

    private static int add(int num1, int num2) {
        int sum;
        int carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;

            num1 = sum;
            num2 = carry;
        } while (carry != 0);
        return num1;
    }
}
