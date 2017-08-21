package com.yc.soap.array;

import java.security.InvalidParameterException;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3，4，5，1，2}为{1，2，3，4，5}的一个旋转，该数组的最小值为1。
 */
public class RotateArray {
    public static void main(String[] args) {
//        int[] array = {3,4,5,1,2};
        int[] array = {8,9,10,1,2,3,4,5,6,7};
//        int[] array = {5,6,7,8,9,10,1,2,3,4};
//        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getSmallest(array));
    }

    private static int getSmallest(int[] array) {
        if (array == null || array.length == 0) {
            throw new InvalidParameterException();
        }
        int low = 0;
        int high = array.length - 1;
        int mid = low;
        if (array[low] <= array[high]) {
            return array[low];
        }
        while (array[low] >= array[high]) {
            if (high - low == 1) {
                mid = high;
                break;
            }
            mid = (low + high) / 2;
            if (array[mid] >= array[low]) {
                low = mid;
            } else if (array[mid] <= array[high]) {
                high = mid;
            }
        }
        return array[mid];
    }

}
