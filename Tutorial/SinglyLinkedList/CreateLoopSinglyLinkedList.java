package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;
import Utils.SinglyLinkedList.ListNode;


public class CreateLoopSinglyLinkedList {
    public static SinglyLinkedList<Integer> createLoopSinglyLinkedList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        ListNode<Integer> first = new ListNode<>(1);

        list.setHead(first);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.createLoop(3);
        return list;
    }
}
