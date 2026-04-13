package BasicMaths;

public class Armstrong {
    public static void main(String[] args) {
        
        printAns(371);

    }

    static void printAns(int num){
        int len = (int) Math.log10(num) + 1;
        
        int navo_javab = 0;

        int copy = num;

        for (int i = 0; i < len; i++, copy/= 10) {
            navo_javab = navo_javab + (int) Math.pow(copy % 10 , len);
        }

        if (navo_javab == num) {
        System.out.println("YES");
            
        }    else{
            System.out.println("NO");
        }}
}
