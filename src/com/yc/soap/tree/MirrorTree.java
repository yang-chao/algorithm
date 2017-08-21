package com.yc.soap.tree;

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
public class MirrorTree {
    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(8);
        TreeNode node6 = new TreeNode(6);
        TreeNode node10 = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);
        TreeNode node12 = new TreeNode(12);
        node8.left = node6;
        node8.right = node10;
        node6.left = node5;
        node6.right = node7;
        node10.left = node9;
        node10.right = node11;
        node11.left = node12;

        midOrder(node8);
        getMirrorTree(node8);
        System.out.println();
        midOrder(node8);
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    private static void getMirrorTree(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null || root.right != null) {
            TreeNode temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            getMirrorTree(root.left);
            getMirrorTree(root.right);
        }
    }

    private static void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + ",");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    private static void midOrder(TreeNode node) {
        if (node != null) {
            midOrder(node.left);
            System.out.print(node.value + ",");
            midOrder(node.right);
        }
    }
}
