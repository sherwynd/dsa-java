package Utils;

public class SinglyLinkedList<T> {
    private ListNode<T> head;

    public ListNode<T> getHead() { //get ListNode
        return head;
    }

    public void setHead(ListNode<T> newHead) { //set new ListNode
        this.head = newHead;
    }

    public static class ListNode<T> {
        public T data; //Generic Type
        public ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(data); // Convert data(hexadecimal or hash code) to String
        }
    }

    public void addFirst(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(T data) {
        ListNode<T> newNode = new ListNode<>(data);

        if (head == null) {
            head = newNode;
        } else {
            ListNode<T> current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void add(T data, int position) {
        ListNode<T> newNode = new ListNode<>(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode<T> previous = head;
            int count = 1;

            while (count < position-1) {
                previous = previous.next;
                count++;
            }

            newNode.next = previous.next;
            previous.next = newNode;

            /* Explaination
            ListNode<T> current = previous.next;
            newNode.next = current;
            previous.next = newNode;
             */
        }
    }

    public void createLoop(int start) {
        ListNode<T> current = head;
        ListNode<T> loopStartNode = null;
        int index = 1;

        while (current.next != null) {
            if (index == start) {
                loopStartNode = current;
            }
            current = current.next;
            index++;
        }
        current.next = loopStartNode; // Creating the loop
    }

    public void deleteFirst() {
        if (head != null) {
            ListNode<T> current = head;
            head = current.next;
            current.next = null;
        }
    }

    public void deleteLast() {
        if (head != null) {
            ListNode<T> current = head;
            ListNode<T> count = head.next;
            while (count.next != null) {
                current = current.next;
                count = count.next;
            }
            current.next = null;
        }
    }

    public void delete(int position) {
        if (position == 1) {
            head = head.next;
        }
        int count = 1;
        ListNode<T> current = head;

        while (count < position-1) {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }

    public boolean searchNode(T data) {
        ListNode<T> current = head;

        while(current != null) {
            if(current.data == data) return true;
            current = current.next;
        }

        return false;
    }

    public void printList() {
        ListNode<T> current = head;

        while (current != null) {
            System.out.print(current + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        int count = 0;
        ListNode<T> current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void printLength() {
        int count = 0;
        ListNode<T> current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(count);
    }

}
