package LinkedList;

public class CustomeLinkedList {
    public int totalLength = 5;
    Node[] list = new Node[totalLength];
    Node currentNode;

    public int length = 0;
    int currentIndex = 0;
    Node head = list[currentIndex];
    Node tail = list[currentIndex];

    public int add(int value) {
        Node newNode = new Node(value);

        if (currentIndex == totalLength - 1) {
            Node[] temp = new Node[totalLength * 2];
            for (int i = 0; i < totalLength; i++) {
                temp[i] = list[i];
            }
            list = temp;
            totalLength *= 2;
        }

        list[currentIndex++] = newNode;
        currentNode = newNode;
        tail = newNode;
        length++;
        return currentNode.getValue();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i <= length) {
            if (list[i] != null) {
                Node cNode = list[i];
                int value = cNode.getValue();
                sb.append(value + " -> ");
            }
            i++;
        }
        return sb.toString() + "null";
    }
}

class Node {
    private int value;

    Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
