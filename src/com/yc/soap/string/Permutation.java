package com.yc.soap.string;

/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 例如输入字符串abc，则打印出由字符a、b、c 所能排列出来的所有字符串abc、acb、bac 、bca、cab 和cba 。
 */
public class Permutation {
    public static void main(String[] args) {
        permutation("abc".toCharArray(), 0);
    }

    private static void permutation(char[] chars, int begin) {
        if (chars == null || chars.length == 0) {
            return;
        }
        if (begin == chars.length - 1) {
            System.out.println(new String(chars));
        } else {
            char temp;
            for (int i = begin; i < chars.length; i++) {
                temp = chars[begin];
                chars[begin] = chars[i];
                chars[i] = temp;

                permutation(chars, begin + 1);

                temp = chars[begin];
                chars[begin] = chars[i];
                chars[i] = temp;
            }
        }
    }
}
