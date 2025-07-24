package KnapSackAlgo;

import java.util.Scanner;

public class KnapSack_DynamicValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items (n): ");
        int n = sc.nextInt();

        System.out.print("Enter capacity of knapsack (W): ");
        int W = sc.nextInt();

        float[] weight = new float[n];
        float[] value = new float[n];

        System.out.println("Enter weights of " + n + " items:");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextFloat();
        }

        System.out.println("Enter values of " + n + " items:");
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextFloat();
        }

        float[] vbyw = new float[n];
        for (int i = 0; i < vbyw.length; i++) {
            vbyw[i] = value[i] / weight[i];
        }

        float[] answers = new float[n];

        float cWeight = 0;
        while (cWeight <= W) {
            int index = findBestValue(vbyw);

            if (weight[index] + cWeight <= W) {
                answers[index] = 1;
                cWeight += weight[index];
            } else {
                answers[index] = (W - cWeight) / weight[index];
                break;
            }

            vbyw[index] = 0;
        }

        float profit = 0;
        for (int i = 0; i < answers.length; i++) {
            profit += value[i] * answers[i];
        }

        System.out.println("Profit : " + profit);
        sc.close();
    }

    static public int findBestValue(float[] vbyw) {
        float max = vbyw[0];
        int index = 0;
        for (int i = 0; i < vbyw.length; i++) {
            if (vbyw[i] > max) {
                max = vbyw[i];
                index = i;
            }
        }

        return index;
    }
}
