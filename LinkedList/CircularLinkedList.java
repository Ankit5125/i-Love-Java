package LinkedList;

public class CircularLinkedList {
    private class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    Node head;
    Node tail;
    public int size;

    public CircularLinkedList(){
        size = 0;
    }

    public void addLast(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insert(int index, int value){
        if (index > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == size) {
            addLast(value);
        }
        else{
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
