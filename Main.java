import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CustomeArrayList myList = new CustomeArrayList();
        // for (int i = 0; i < 10; i++) {
        // int ele = sc.nextInt();
        // myList.add(ele);
        // }

        // System.out.println(myList.toString());
        // System.out.println(myList.totalLength);
        // System.out.println(myList.length);

        // ---------------------------------------------------------------------------------

        // LinkedList list = new LinkedList();
        // list.addFirst(10);
        // list.addFirst(20);
        // list.addFirst(30);
        // list.addLast(40);
        // list.insert(2, 50);

        // // list.deleteFirst();
        // list.deleteLast();

        // ---------------------------------------------------------------------------------

        // DoublyLinkedList list = new DoublyLinkedList();
        // list.addFirst(10);
        // list.addFirst(20);
        // list.addFirst(30);
        // list.addLast(40);
        // list.addLast(50);
        // list.insert(3, 100);

        CircularLinkedList list = new CircularLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.insert(1, 100);
        list.addLast(40);
        list.addLast(50);
        list.removeFirst();
        list.removeLast();

        System.out.println("List : " + list.toString());
        // System.out.print("Reverse : ");
        // list.reverse();
        System.out.println("Size : " + list.size);

        sc.close();
    }
}
