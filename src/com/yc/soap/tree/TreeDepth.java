package com.yc.soap.tree;

/**
 * 输入一棵二叉树的根结点，求该树的深度。从根结点到叶子点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class TreeDepth {

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }

    private static int getTreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getTreeDepth(root.left);
        int right = getTreeDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
