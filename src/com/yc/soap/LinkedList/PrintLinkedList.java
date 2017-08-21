package com.yc.soap.LinkedList;

import java.util.Stack;

/**
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 */
public class PrintLinkedList {
    public static void main(String[] args) {
        ListNode b = new ListNode(3, null);
        ListNode a = new ListNode(2, b);
        ListNode head = new ListNode(1, a);
//        reversePrint(head);
        reversePrint2(head);
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private static void reversePrint(ListNode headNode) {
        Stack<Integer> stack = new Stack<>();
        while (headNode != null) {
            stack.push(headNode.value);
            headNode = headNode.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void reversePrint2(ListNode node) {
        if (node == null) {
            return;
        }
        if (node.next != null) {
            reversePrint2(node.next);
        }
        System.out.println(node.value);
    }
}
