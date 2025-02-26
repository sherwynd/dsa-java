package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class FindStartOfLoopSinglyLinkedList {
    public static <T> SinglyLinkedList.ListNode<T> findStartOfLoopSinglyLinkedList(SinglyLinkedList<T> loopList) {
        //Do Floyd's Cycle Detection algorithm
        SinglyLinkedList.ListNode<T> slow = loopList.getHead();
        SinglyLinkedList.ListNode<T> fast = loopList.getHead();
        boolean isLoop = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                isLoop = true;
                break;
            }
        }

        //Find Start Node
        if(isLoop) {
            slow = loopList.getHead();

            while (slow != fast) {
                slow = slow.next;
                fast = fast.next; // Move both at the same pace
            }
            return slow;
        }
        return null;
    }
}
