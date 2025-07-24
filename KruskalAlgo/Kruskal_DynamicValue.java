package KruskalAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class Kruskal_DynamicValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices (V): ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        int[][] edges = new int[E][3];

        System.out.println("Enter each edge in format: source destination weight");
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt(); // source
            edges[i][1] = sc.nextInt(); // destination
            edges[i][2] = sc.nextInt(); // weight
        }

        int[] parent = new int[V];
        for (int i = 0; i < V; i++)
            parent[i] = i;

        // Sort edges by weight
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        System.out.println("\nMinimum Spanning Tree (MST):");
        int count = 0;
        int tCost = 0;
        for (int i = 0; i < edges.length && count < V - 1; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            int weight = edges[i][2];

            int set1 = find(parent, src);
            int set2 = find(parent, dest);

            if (set1 != set2) {
                System.out.println(src + " -> " + dest + " = " + weight);
                tCost += weight;
                union(parent, set1, set2);
                count++;
            }
        }
        System.out.println("\nTotal Cost : " + tCost);
        sc.close();
    }

    static int find(int[] parent, int i) {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }

    static void union(int[] parent, int x, int y) {
        parent[x] = y;
    }
}
