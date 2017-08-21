package com.yc.soap.tree;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回true。否则返回false。假设输入的数组的任意两个数字都互不相同。
 */
public class BinarySearchTree {
    public static void main(String[] args) {

    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    private static boolean isPostOrder(int[] array, int length) {
        if (array == null || length == 0) {
            return false;
        }
        int rootValue = array[length - 1];
        int i = 0;
        for (; i < length - 1; i++) {
            if (array[i] > rootValue) {
                break;
            }
        }

        for (int j = i; j < length - 1; j++) {
            if (array[j] < rootValue) {
                return false;
            }
        }
        boolean left = true;
        if (i > 0) {
            left = isPostOrder(array, i);
        }
        boolean right = true;
        if (i < length - 1) {
            right = isPostOrder(array, length - i - 1);
        }
        return left && right;
    }
}
