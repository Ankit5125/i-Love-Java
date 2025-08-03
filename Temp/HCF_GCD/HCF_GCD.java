package HCF_GCD;

public class HCF_GCD {
    public static void main(String[] args) {
        
        int num1 = 18, num2 = 4;

        System.out.println(GCD(num1, num2));

    }

    static int GCD(int num1, int num2){
        int ans = 1;
        int index = 2;
        while (index <= num1 && index <= num2) {
            if (num1 % index == 0 && num2 % index == 0) {
                ans = index;
            }
            index++;
        }
        return ans;
    }
}
