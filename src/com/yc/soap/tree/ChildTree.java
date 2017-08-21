package com.yc.soap.tree;

/**
 * 输入两颗二叉树A和B，判断B是不是A的子结构。
 */
public class ChildTree {
    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(8);
        TreeNode node88 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node77 = new TreeNode(7);
        node8.left = node88;
        node8.right = node7;
        node88.left = node9;
        node88.right = node2;
        node2.left = node4;
        node2.right = node77;

        TreeNode node888 = new TreeNode(8);
        TreeNode node999 = new TreeNode(9);
        TreeNode node222 = new TreeNode(2);
        node888.left = node999;
        node888.right = node222;

        System.out.println(isSubTree(node8, node888));
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static boolean isSubTree(TreeNode node1, TreeNode node2) {
        boolean result = false;
        if (node1 != null && node2 != null) {
            if (node1.value == node2.value) {
                result = isSubTreeInner(node1, node2);
            }
            if (!result) {
                isSubTree(node1.left, node2);
            }
            if (!result) {
                isSubTree(node1.right, node2);
            }
        }
        return result;
    }

    public static boolean isSubTreeInner(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null) {
            return false;
        }
        return isSubTreeInner(node1.left, node2.left) && isSubTreeInner(node1.right, node2.right);
    }
}
