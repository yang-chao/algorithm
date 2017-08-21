package com.yc.soap.LinkedList;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class LastKNode {
    public static void main(String[] args) {
        ListNode c = new ListNode(4, null);
        ListNode b = new ListNode(3, c);
        ListNode a = new ListNode(2, b);
        ListNode head = new ListNode(1, a);
        ListNode node = getTheLastKNode(head, 11);
        if (node == null) {
            System.out.println("链表结点数小于k");
        } else {
            System.out.println(node.value);
        }
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private static ListNode getTheLastKNode(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        int n = 1;
        ListNode node = head;
        while (n <= k - 1) {
            if (node == null) {
                return null;
            } else {
                node = node.next;
                n++;
            }
        }

        while (node.next != null) {
            head = head.next;
            node = node.next;
        }
        return head;
    }
}
