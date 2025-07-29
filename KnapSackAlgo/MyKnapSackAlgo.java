package KnapSackAlgo;

import java.util.Scanner;

public class MyKnapSackAlgo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items (n): ");
        int n = sc.nextInt();

        System.out.print("Enter capacity of knapsack (W): ");
        int W = sc.nextInt();

        float[] w = new float[n];
        float[] v = new float[n];

        System.out.println("Enter weights of " + n + " items:");
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextFloat();
        }

        System.out.println("Enter values of " + n + " items:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextFloat();
        }

        float[] v_w = new float[n];
        for (int i = 0; i < v_w.length; i++) {
            v_w[i] = v[i] / w[i];
        }

        float[] x = new float[n];

        float cWeight = 0;
        while (cWeight <= W) {
            float max = v_w[0];
            int index = 0;
            for (int i = 0; i < v_w.length; i++) {
                if (v_w[i] > max) {
                    max = v_w[i];
                    index = i;
                }
            }

            if (w[index] + cWeight <= W) {
                x[index] = 1;
                cWeight += w[index];
            } else {
                x[index] = (W - cWeight) / w[index];
                break;
            }

            v_w[index] = 0;
        }

        float profit = 0;
        for (int i = 0; i < x.length; i++) {
            profit += v[i] * x[i];
            System.out.println("Weight : " + w[i] + "\tX : " + x[i] + "\t\tProfit : " + v[i]*x[i]);
        }

        System.out.println("Total Profit : " + profit);
        sc.close();
    }
}
