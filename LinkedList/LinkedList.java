package LinkedList;

public class LinkedList {

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return this.value + "";
        }
    }

    public int size;
    public Node head;
    public Node tail;

    public LinkedList() {
        size = 0;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        } else if (index == size) {
            addLast(value);
            return;
        } else {
            if (index > size) {
                System.out.println("Enter Valid Index");
            } else {
                Node newNode = new Node(value);
                Node temp = head;
                int i = 0;
                while (i != index) {
                    temp = temp.next;
                    i++;
                }
                Node remainingNodes = temp.next;
                temp.next = newNode;
                newNode.next = remainingNodes;
                size++;
            }
        }
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        } else {
            Node cNode = head;
            while (cNode.next != tail) {
                cNode = cNode.next;
            }
            cNode.next = null;
            tail = cNode;
            size--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node currNode = head;

        while (currNode != tail) {
            sb.append(currNode.value + " -> ");
            currNode = currNode.next;
        }
        return sb.append(currNode.value).toString();
    }
}
