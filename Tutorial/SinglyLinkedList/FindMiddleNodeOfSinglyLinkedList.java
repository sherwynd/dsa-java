package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class FindMiddleNodeOfSinglyLinkedList {
    public static <T> void findMiddleNodeOfSinglyLinkedList(SinglyLinkedList<T> nodes) {
        SinglyLinkedList.ListNode<T> slow = nodes.getHead(); //getting Middle Node
        SinglyLinkedList.ListNode<T> fast = nodes.getHead(); //getting end of Node

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Node : " + slow.data);
    }
}
