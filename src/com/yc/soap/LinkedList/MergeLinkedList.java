package com.yc.soap.LinkedList;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。
 */
public class MergeLinkedList {
    public static void main(String[] args) {
        ListNode c = new ListNode(5, null);
        ListNode b = new ListNode(3, c);
        ListNode a = new ListNode(1, b);

        ListNode f = new ListNode(6, null);
        ListNode e = new ListNode(4, f);
        ListNode d = new ListNode(2, e);

        print(merge(a, d));
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    private static ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }
        ListNode mergedHead;
        if (head1.value <= head2.value) {
            mergedHead = head1;
            mergedHead.next = merge(head1.next, head2);
        } else {
            mergedHead = head2;
            mergedHead.next = merge(head2.next, head1);
        }
        return mergedHead;
    }

    private static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.value + ",");
            node = node.next;
        }
    }
}
