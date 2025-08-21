package LinkedList;

public class CircularLinkedList {
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    public int size;

    public CircularLinkedList() {
        size = 0;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head; // circular
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // safe now
        }
        size++;
    }

    public void insert(int index, int value) {
        if (index > size) {
            System.out.println("Invalid Index");
            return;
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node newNode = new Node(value);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("No Element Found");
            return;
        } else if (size == 1) {
            head = tail = null;
            size--;

        } else {
            head = head.next;
            size--;
            tail.next = head;
        }
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("No Element Found");
            return;
        } else if (size == 1) { // only one element
            head = null;
            tail = null;
            size--;
        } else {
            Node node = head;
            while (node.next != tail) {
                node = node.next;
            }
            node.next = head;
            tail = node;
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node temp = head;
        while (temp != tail) {
            sb.append(temp.value + " -> ");
            temp = temp.next;
        }

        return sb.toString() + tail.value;
    }
}
