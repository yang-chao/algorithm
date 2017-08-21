package com.yc.soap.LinkedList;

/**
 * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
 * Created by yc-mac on 17/6/13.
 */
public class ReverseSingleLinkedList {

    public static void main(String[] args) {
        ListNode c = new ListNode(4, null);
        ListNode b = new ListNode(3, c);
        ListNode a = new ListNode(2, b);
        ListNode head = new ListNode(1, a);

        print(head);
        System.out.println();
        print(reverse(head));
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private static ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode reverseHead = null;
        ListNode node = head;
        ListNode preNode = null;
        while (node != null) {
            ListNode nextNode = node.next;
            if (nextNode == null) {
                reverseHead = node;
            }
            node.next = preNode;
            preNode = node;
            node = nextNode;
        }
        return reverseHead;
    }

    private static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.value);
            System.out.print(",");
            node = node.next;
        }
    }

}
