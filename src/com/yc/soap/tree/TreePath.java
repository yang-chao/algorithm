package com.yc.soap.tree;

import java.util.Stack;

/**
 * 输入一棵二叉树和一个整数， 打印出二叉树中结点值的和为输入整数的所有路径。从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class TreePath {
    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node10 = new TreeNode(10);
        TreeNode node12 = new TreeNode(12);

        node10.left = node5;
        node10.right = node12;
        node5.left = node4;
        node5.right = node7;

        getTreePath(node10, 22, 0, new Stack<>());
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    private static void getTreePath(TreeNode root, int n, int sum, Stack<TreeNode> stack) {
        if (root == null) {
            return;
        }
        sum += root.value;
        stack.push(root);
        if (sum == n && root.left == null && root.right == null) {
            printStack(stack);
        }

        if (root.left != null) {
            getTreePath(root.left, n, sum, stack);
        }
        if (root.right != null) {
            getTreePath(root.right, n, sum, stack);
        }

//        sum -= root.value;
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    private static void printStack(Stack<TreeNode> stack) {
        if (stack == null) {
            return;
        }
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i).value + ",");
        }
        System.out.println(" --End");
    }
}
