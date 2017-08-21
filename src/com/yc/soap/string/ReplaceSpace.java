package com.yc.soap.string;

import java.util.Arrays;

/**
 * 请实现一个函数，把字符串中的每个空格替换成%20。
 * 例如输入"We are happy."，则输出"We%20are%20happy."。
 * Created by yc-mac on 2017/8/17.
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        String str = "We are happy.";
        System.out.println(replaceSpace(str.toCharArray()));
    }

    private static char[] replaceSpace(char[] orig) {
        if (orig == null || orig.length == 0) {
            return null;
        }
        int numOfSpace = 0;
        for (int i = 0; i < orig.length; i++) {
            if (orig[i] == ' ') {
                numOfSpace++;
            }
        }
        int newLength = orig.length + numOfSpace * 2;
        char[] newOrig = Arrays.copyOf(orig, newLength);
        int indexOfOld = orig.length - 1;
        int indexOfNew = newLength - 1;
        while (indexOfNew > indexOfOld) {
            if (newOrig[indexOfOld] != ' ') {
                newOrig[indexOfNew--] = newOrig[indexOfOld--];
            } else {
                newOrig[indexOfNew--] = '0';
                newOrig[indexOfNew--] = '2';
                newOrig[indexOfNew--] = '%';
                indexOfOld--;
            }
        }
        return newOrig;
    }
}
