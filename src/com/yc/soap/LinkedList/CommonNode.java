package com.yc.soap.LinkedList;

import java.util.Stack;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class CommonNode {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node6;
        node6.next = node7;
        node4.next = node5;
        node5.next = node6;

        ListNode node = findCommonNode(node1, node4);
        if (node != null) {
            System.out.println(node.value);
        } else {
            System.out.println("没有找到");
        }
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    private static ListNode findCommonNode(ListNode node1, ListNode node2) {
        if (node1 == null || node2 == null) {
            return null;
        }
        Stack<ListNode> stack1 = new Stack<>();
        while (node1 != null) {
            stack1.push(node1);
            node1 = node1.next;
        }
        Stack<ListNode> stack2 = new Stack<>();
        while (node2 != null) {
            stack2.push(node2);
            node2 = node2.next;
        }
        ListNode commonNode = null;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if (stack1.peek() == stack2.peek()) {
                commonNode = stack1.pop();
                stack2.pop();
            } else {
                break;
            }
        }
        return commonNode;
    }
}
