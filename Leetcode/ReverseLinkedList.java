package Leetcode;

import Utils.SinglyLinkedList;
import Utils.SinglyLinkedList.ListNode;


public class ReverseLinkedList {
    public static <T> void reverseLinkedList(SinglyLinkedList<T> head) {
        ListNode<T> current = head.getHead();
        SinglyLinkedList.ListNode<T> prev = null; //list of reverse linked list
        SinglyLinkedList.ListNode<T> next; //act as temp

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Update the list's head to the new head (prev)
        head.setHead(prev);
        System.out.println("Reverse Linked List :");
        head.printList();
    }
}
