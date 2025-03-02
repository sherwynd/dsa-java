package Utils;

public class DoublyLinkedList<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int length;

    public static class ListNode<T> {
        public T data;
        public ListNode<T> next;
        public ListNode<T> prev;

        public ListNode(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return String.valueOf(data); // Convert data(hexadecimal or hash code) to String
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length= 0;
    }

    public boolean isEmpty() {
        return length == 0; //head == null
    }

    public int length() { return length; }

    public void addFirst(T data) {
        ListNode<T> newNode = new ListNode<>(data);

        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addLast(T data) {
        ListNode<T> newNode = new ListNode<>(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;  // tail have something so we put at tail.next
        }
        newNode.prev = tail; // tail <-- newNode
        tail = newNode;
        length++;
    }

    public void deleteFirst() {
        if (isEmpty()) {return;}

        if(head == tail) { // this will remove tail null so that no ListNode exit
            tail = null;
        } else {
            head.next.prev = null;
        }
        ListNode<T> temp = head; // temp & head
        head = head.next;
        temp.next = null;
    }

    public void deleteLast() {
        if (isEmpty()) {return;}

        if(head == tail) { // this will remove head null so that no ListNode exit
            head = null;
        } else {
            tail.prev.next = null;
        }
        ListNode<T> temp = tail; // temp & tail
        tail = tail.prev;
        temp.prev = null;
    }

    public void printForwardList() {
        System.out.println("Print Forward List");
        if (head == null) return;

        ListNode<T> curr = head;

        while (curr != null) {
            System.out.print(curr + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void printBackwardList() {
        System.out.println("Print Backward List");
        if (tail == null) return;

        ListNode<T> curr = tail;

        while (curr != null) {
            System.out.print(curr + " --> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }
}
