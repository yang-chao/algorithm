package com.yc.soap.string;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "I am a student.";
        char[] chars = str.toCharArray();
        reverseSentence(chars);
        System.out.println(new String(chars));
    }

    private static void reverse(char[] chars, int start, int end) {
        if (chars == null) {
            return;
        }
        char temp;
        while (start < end) {
            temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;

            start++;
            end--;
        }
    }

    private static void reverseSentence(char[] chars) {
        if (chars == null) {
            return;
        }
        reverse(chars, 0, chars.length - 1);

        int start = 0;
        int end = 0;
        while (start < chars.length) {
            if (chars[start] == ' ') {
                start++;
                end++;
            } else if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                end++;
                start = end;
            } else {
                end++;
            }
        }
    }
}
