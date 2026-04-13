package BasicMaths;

import java.util.Set;
import java.util.HashSet;

public class AllDivisiors {

    public static void main(String[] args) {
        printAns(36);
    }

    static void printAns(int num){

        Set<Integer> javab = new HashSet<Integer>();

        for (int i = 1; i <= Math.sqrt(36); i++) {
            if ( num % i == 0) {
                javab.add(i);
                javab.add(num / i);
            }
        }

        System.out.println(javab);

    }
}