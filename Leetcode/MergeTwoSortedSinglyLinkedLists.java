package Leetcode;

import Utils.SinglyLinkedList;

public class MergeTwoSortedSinglyLinkedLists {
    public static <T> SinglyLinkedList.ListNode<Integer> mergeTwoSortedSinglyLinkedLists(SinglyLinkedList.ListNode<Integer> head1, SinglyLinkedList.ListNode<Integer> head2) {
        SinglyLinkedList.ListNode<Integer> dummy = new SinglyLinkedList.ListNode<>(0); // 0->null created
        SinglyLinkedList.ListNode<Integer> tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }


        if (head1 == null) {
            tail.next = head2; //get all remaining head2 linked list since h1 list is empty
        } else {
            tail.next = head1; //get all remaining head1 linked list
        }

        return dummy.next;
    }
}
