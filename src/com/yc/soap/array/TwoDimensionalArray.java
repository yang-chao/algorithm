package com.yc.soap.array;

/**
 * 在一个二维数组中，每一行都是按照从左到右递增的顺序排列，每一列都是按照从上到下递增的顺序排列。
 * 请完成一个函数，输入这样一个数组和一个整数，判断数组中是否含有该整数。
 * Created by yc-mac on 2017/8/16.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(findFromArray(array, 0));
    }

    private static boolean findFromArray(int[][] array, int key) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int rows = array.length;
        int cols = array[0].length;
        for (int i = rows - 1; i >= 0; i--) {
            if (array[i][0] == key) {
                return true;
            } else if (array[i][0] < key) {
                for (int j = 1; j < cols; j++) {
                    if (array[i][j] == key) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
