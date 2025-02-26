package Leetcode;

import Utils.SinglyLinkedList;

public class AddTwoNumbers {
    public static <T> SinglyLinkedList.ListNode<Integer> addTwoNumbers(SinglyLinkedList.ListNode<Integer> l1, SinglyLinkedList.ListNode<Integer> l2) {
        SinglyLinkedList.ListNode<Integer> head = new SinglyLinkedList.ListNode<>(0);
        SinglyLinkedList.ListNode<Integer> curr = head;
        int carry = 0;

        while (l1 != null || l2 != null) { // using OR operator where either listnode is not empty
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;
            int sum = x + y + carry; //to check is carry is 1 or 0
            carry = sum / 10; //to see if sum is more than 9
            curr.next = new SinglyLinkedList.ListNode<>(sum % 10); //get the curr value
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) curr.next = new SinglyLinkedList.ListNode<>(carry);

        return head.next;
    }
}
