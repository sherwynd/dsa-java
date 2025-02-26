package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class InsertNodeInSortedLinkedList {
    public static <T extends Comparable<T>> void insertNodeInSortedLinkedList(SinglyLinkedList<T> nodes, T value) {
        SinglyLinkedList.ListNode<T> current = nodes.getHead(); //1->2->4->5->null
        SinglyLinkedList.ListNode<T> newNodeHead = new SinglyLinkedList.ListNode<>(value); // 4->null
        SinglyLinkedList.ListNode<T> temp = null;

        while (current != null && current.data.compareTo(value) < 0) {
            temp = current;
            current = current.next;
        }

        newNodeHead.next = current;
        temp.next = newNodeHead;
        nodes.printList();
    }
}
