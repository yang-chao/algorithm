package com.yc.soap.string;

/**
 * 在字符串中找出第一个只出现一次的字符。
 */
public class FirstSingleLetter {
    public static void main(String[] args) {
        String str = "abaccdebdevff";
        System.out.println(getFirstSingleChar(str));
        System.out.println(Integer.valueOf('a'));
    }

    private static char getFirstSingleChar(String str) {
        if (str == null) {
            return ' ';
        }
        int[] charMap = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charMap[str.charAt(i)] += 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (charMap[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return ' ';
    }
}
