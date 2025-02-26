package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class RemoveKeyFromSinglyLinkedList {
    public static <T extends Comparable<T>> void removeKeyFromSinglyLinkedList(SinglyLinkedList<T> head, T key) {
        SinglyLinkedList.ListNode<T> current = head.getHead();
        SinglyLinkedList.ListNode<T> temp = null;

        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }

        if(current == null) return;
        temp.next = current.next;

        head.printList();
    }
}
