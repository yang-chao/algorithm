package com.yc.soap.tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树第k层结点个数。
 */
public class KFloorOfTree {
    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(8);
        TreeNode node6 = new TreeNode(6);
        TreeNode node10 = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node11 = new TreeNode(11);
        node8.left = node6;
        node8.right = node10;
        node6.left = node5;
        node6.right = node7;
        node10.left = node9;
        node10.right = node11;

        System.out.println(check(node8, 3));
        System.out.println(kNodeCount1(node8, 3));
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    private static int check(TreeNode node, int k) {
        if (k <= 0) {
            return 0;
        }
        return kNodeCount(node, k);
    }

    private static int kNodeCount(TreeNode node, int k) {
        if (node == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return kNodeCount(node.left, k - 1) + kNodeCount(node.right, k - 1);
    }

    private static int kNodeCount1(TreeNode node, int k) {
        if (node == null) {
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        int curFloorCount = 0;
        int curFloor = 0;
        while (!queue.isEmpty()) {
            curFloor++;
            curFloorCount = queue.size();
            if (curFloor == k) {
                break;
            }

            int cur = 0;
            while (cur < curFloorCount) {
                cur++;
                node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        if (curFloor == k) {
            return curFloorCount;
        }
        return 0;
    }
}
