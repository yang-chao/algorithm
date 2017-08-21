package com.yc.soap.tree;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树并输出根结点。
 */
public class ReBuildBinaryTree {
    public static void main(String[] args) {
        int[] preSort = {1,2,4,7,3,5,6,8};
        int[] midSort = {4,7,2,1,5,3,8,6};

        TreeNode root = reBuildTree(preSort, 0, preSort.length - 1, midSort, 0, midSort.length - 1);

        printPreOrder(root);
        System.out.println("");
        printMidOrder(root);
        System.out.println("");
        printPostOrder(root);
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }

    private static TreeNode reBuildTree(int[] preOrder, int preStart, int preEnd, int[] midOrder, int midStart, int midEnd) {
        if (preOrder == null || preOrder.length == 0 || midOrder == null || midOrder.length == 0) {
            return null;
        }
        if (preStart > preEnd) {
            return null;
        }
        int value = preOrder[preStart];
        int index = midStart;
        while (index <= midEnd && midOrder[index] != value) {
            index++;
        }
        int leftLength = index - midStart;
        TreeNode node = new TreeNode();
        node.value = value;
        node.left = reBuildTree(preOrder, preStart + 1, preStart + leftLength, midOrder, midStart, index - 1);
        node.right = reBuildTree(preOrder, preStart + leftLength + 1, preEnd, midOrder, index + 1, midEnd);
        return node;
    }

    private static void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value);
        System.out.print(",");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private static void printMidOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printMidOrder(root.left);
        System.out.print(root.value);
        System.out.print(",");
        printMidOrder(root.right);
    }

    private static void printPostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.value);
        System.out.print(",");
    }
}
