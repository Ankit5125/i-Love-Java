package LinkedList;

public class CustomLinkedList {
    
    public static class Node {
        int value;
        Node next;
        Node(int value){
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

    public CustomLinkedList(){
        size = 0;
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addLast(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
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
