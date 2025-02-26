package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class CreateSinglyLinkedList {
    public static void createSinglyLinkedList() {
        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();

        myList.addLast(8);
        myList.addLast(4);
        myList.addLast(2);
        myList.add(5, 3);
        myList.delete(3);
        myList.printList();
    }
}
