package com.yc.soap.tree;

import java.util.Stack;

public class Traversal {
    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(8);
        TreeNode node6 = new TreeNode(6);
        TreeNode node10 = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);
        TreeNode node3 = new TreeNode(3);
        node8.left = node6;
        node8.right = node10;
        node6.left = node5;
        node6.right = node7;
        node10.left = node9;
        node10.right = node11;
        node5.right = node3;

        preOrder(node8);
        System.out.println();
        preOrder1(node8);
        System.out.println();
        midOrder(node8);
        System.out.println();
        midOrder1(node8);
        System.out.println();
        postOrder(node8);
        System.out.println();
        postOrder1(node8);
        System.out.println();
        postOrder2(node8);
    }

    static class TreeNode {
        int value;
        int flag;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + ",");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void preOrder1(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                System.out.print(root.value + ",");
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
    }

    private static void midOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        midOrder(node.left);
        System.out.print(node.value + ",");
        midOrder(node.right);
    }

    private static void midOrder1(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.print(node.value + ",");
            node = node.right;
        }
    }

    private static void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + ",");
    }

    private static void postOrder1(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        TreeNode pre = null;
        while (!stack.isEmpty()) {
            node = stack.peek();
            if ((node.left == null && node.right == null) ||
                    (pre != null && ((pre == node.left && node.right == null) || pre == node.right))) {
                System.out.print(node.value + ",");
                stack.pop();
                pre = node;
            } else {
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
    }

    private static void postOrder2(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                node.flag = 1;
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            if (node.flag == 1) {
                node.flag++;
                stack.push(node);
                node = node.right;
            } else if (node.flag == 2) {
                System.out.print(node.value + ",");
                node = null;
            }
        }
    }
}
