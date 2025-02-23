package Tutorial.LinkedList;

import Utils.SinglyLinkedList;

public class CreateLinkedList {
    public static void createLinkedList() {
        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();

        myList.addLast(8);
        myList.addLast(4);
        myList.addLast(2);
        myList.add(5, 3);
        myList.delete(3);
        myList.printList();
    }
}
