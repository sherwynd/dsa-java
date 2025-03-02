package Utils;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public static class ListNode {
        public ListNode next;
        public int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0; //head == null
    }

    public int length() { return length; }

    public void printList() {
        if(last == null) return;

        ListNode first = last.next;

        while(first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);

        if(last == null) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void addLast(int data) {
        ListNode newNode = new ListNode(data);

        if(last == null) {
            last = newNode;
            last.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void deleteFirst() {
        if(last == null) throw new RuntimeException("No more node");

        if(last.next == last) {
            last = null;
        } else {
            ListNode first = last.next;
            last.next = first.next;
            first.next = null;
        }
        length--;
    }

    public void deleteLast() {
        if(last == null) throw new RuntimeException("No more node");

        if(last.next == last) {
            last = null;
        } else {
            ListNode first = last.next;

            while(first.next != last) {
                first = first.next;
            }

            
        }
    }
}
