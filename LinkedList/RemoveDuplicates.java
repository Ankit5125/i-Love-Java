public class RemoveDuplicates {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.addFirst(new int[] {10,20,20,30,40,40,50});

        list = solution(list);
        System.out.println(list);
    }

    public static LinkedList solution(LinkedList list){
        LinkedList copyList = list;
        while (copyList.head.next != null) {
            if (copyList.head.value == copyList.head.next.value) {
                copyList.head = copyList.head.next;
            }
            copyList.head = copyList.head.next;
        }
        return copyList;
    }
}