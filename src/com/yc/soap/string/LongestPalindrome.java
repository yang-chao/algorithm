package com.yc.soap.string;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "cabebacdef";
        System.out.println(longestPalindrome(str.toCharArray()));
    }

    private static String longestPalindrome(char[] s) {
        if (s == null || s.length == 0) {
            return "";
        }
        int low;
        int high;
        int maxLength = 0;
        int start = 0;
        for (int i = 1; i < s.length; i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length && s[low] == s[high]) {
                low--;
                high++;
            }
            if (high - low - 1 > maxLength) {
                maxLength = high - low - 1;
                start = low + 1;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length && s[low] == s[high]) {
                low--;
                high++;
            }
            if (high - low - 1 > maxLength) {
                maxLength = high - low - 1;
                start = low + 1;
            }
        }
        return new String(s).substring(start, maxLength);
    }
}
