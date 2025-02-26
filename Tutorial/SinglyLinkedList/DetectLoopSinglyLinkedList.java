package Tutorial.SinglyLinkedList;

import Utils.SinglyLinkedList;

public class DetectLoopSinglyLinkedList {
    public static <T> boolean detectLoopSinglyLinkedList(SinglyLinkedList<T> head){
        //Floyd's Cycle Detection algorithm
        SinglyLinkedList.ListNode<T> fast = head.getHead();
        SinglyLinkedList.ListNode<T> slow = head.getHead();

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                System.out.println("Loop detected!");
                return true;
            }
        }
        System.out.println("No Loop detected.");
        return false;
    }
}
