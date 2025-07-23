package Practice;

public class Temp {

    static int[] arr = new int[10];

    static void insert(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*23;
        }
    }

    static int find(int x){
        if (arr[x] == x) {
            return x;
        }
        System.out.println("value : "+ x + "Element : " + arr[x]);
        return find(arr[x]);
    } 

    public static void main(String[] args) {
        
        insert();
        System.out.println(find(5));
    }
}
