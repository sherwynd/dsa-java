package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class RemoveLoopFromSinglyLinkedList {
    public static <T> void removeLoopFromSinglyLinkedList(SinglyLinkedList<T> list) {
        SinglyLinkedList.ListNode<T> slow = list.getHead();
        SinglyLinkedList.ListNode<T> fast = list.getHead();
        boolean isLoop = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isLoop = true;
                break;
            }
        }

        System.out.println("checking done");
        if (isLoop) {
            SinglyLinkedList.ListNode<T> temp = list.getHead();

            while (temp.next != slow.next) {
                temp = temp.next;
                slow = slow.next;
            }
            slow.next = null;
        }
        list.printList();
    }
}
