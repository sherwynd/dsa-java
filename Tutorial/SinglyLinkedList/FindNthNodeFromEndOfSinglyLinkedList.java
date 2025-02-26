package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class FindNthNodeFromEndOfSinglyLinkedList {
    public static <T> T findNthNodeFromEndOfSinglyLinkedList(SinglyLinkedList<T> nodes, int n) {
        SinglyLinkedList.ListNode<T> main = nodes.getHead();
        SinglyLinkedList.ListNode<T> ref = nodes.getHead();
        int count = 0;
        while (count < n) {
            ref = ref.next;
            count++;
        }
        while (ref != null) {
            ref = ref.next;
            main = main.next;
        }

        System.out.println("The " + n + "th of end of the Linked List : " + main.data);
        return main.data;
    }
}
