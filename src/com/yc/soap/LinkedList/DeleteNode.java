package com.yc.soap.LinkedList;

/**
 * 给定单向链表的头指针和一个结点指针，定义一个函数在O（1）时间删除该结点。
 */
public class DeleteNode {
    public static void main(String[] args) {
        ListNode b = new ListNode(3, null);
//        ListNode a = new ListNode(2, b);
//        ListNode head = new ListNode(1, a);

        printListNode(b);
        deleteNode(b, b);
        System.out.println();
        printListNode(b);
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private static void deleteNode(ListNode head, ListNode node) {
        if (head == null || node == null) {
            return;
        }
        if (node.next != null) {
            node.value = node.next.value;
            node.next = node.next.next;
            node.next = null;
        } else if (head == node) {
            head = null;
            node = null;
        } else {
            ListNode pNode = head;
            while (pNode.next != node) {
                pNode = pNode.next;
            }
            pNode.next = null;
            node = null;
        }
    }

    private static void printListNode(ListNode head) {
        if (head == null) {
            System.out.println("nothing");
            return;
        }
        while (head != null) {
            System.out.print(head.value);
            System.out.print(",");
            head = head.next;
        }
    }
}
