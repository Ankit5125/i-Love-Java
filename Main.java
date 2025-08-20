import java.util.Scanner;

import LinkedList.CustomeLinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CustomeLinkedList myList = new CustomeLinkedList();
        for (int i = 0; i < 10; i++) {
            int ele = sc.nextInt();
            myList.add(ele);
        }

        System.out.println(myList.toString());
        System.out.println(myList.totalLength);
        System.out.println(myList.length);

        sc.close();
    }
}
