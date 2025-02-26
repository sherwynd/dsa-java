package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class RemoveDuplicatedFromSortedLinkedList {
    public static <T> void removeDuplicatedFromSortedLinkedList(SinglyLinkedList<T> nodes) {
        SinglyLinkedList.ListNode<T> current = nodes.getHead();
        SinglyLinkedList.ListNode<T> temp = null;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        nodes.printList();
    }
}
