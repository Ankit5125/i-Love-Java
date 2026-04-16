package BasicRecursion;

public class PrintNames {
    public static void main(String[] args) {
        
        printAns("Ankit", 5);

    }

    static void printAns(String tamaru_naam, int ketli_vaar){
        if (ketli_vaar == 1) {
            System.out.println(tamaru_naam);
            return;
        }

        printAns(tamaru_naam, ketli_vaar - 1);
        System.out.println(tamaru_naam);
    }
}
