

public class DoublyLinkedList {
    static class Node {
        int value;
        Node next;
        Node previous;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    Node head;
    Node tail;
    public int size;

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int index, int value) {
        if (index > size) {
            System.out.println("Invalid Index");
            return;
        } else if (index == 0) {
            addFirst(value);
            return;
        } else if (index == size) {
            addLast(value);
        } else {
            Node newNode = new Node(value);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.previous = temp;
            if (temp.next != null) {
                temp.next.previous = newNode;
            }
            temp.next = newNode;
            size++;
        }
    }

    public void reverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.previous;
        }
        System.out.println("END");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.value + " -> ");
            temp = temp.next;
        }
        return sb.toString() + "END";
    }
}
