package BasicMaths;

public class CountDigit {
    public static void main(String[] args) {
        printAns(12345);
    }

    static void printAns(int num){
        System.out.println("Total Numbers : " + (int) (Math.log10(num)+1));
    }
}
