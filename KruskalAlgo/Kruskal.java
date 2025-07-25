package KruskalAlgo;

import java.util.Arrays;

public class Kruskal {
    public static void main(String[] args) {
        int V = 4; // number of vertices
        int[][] edges = {
            {0, 1, 10}, {0, 2, 6}, {0, 3, 5}, {1, 3, 15}, {2, 3, 4}
        };

        int[] parent = new int[V];
        for (int i = 0; i < V; i++)
            parent[i] = i;

        // Sort edges by weight
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        System.out.println("Minimum Spanning Tree (MST):");
        int count = 0;
        for (int i = 0; i < edges.length && count < V - 1; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            int weight = edges[i][2];

            int set1 = find(parent, src);
            int set2 = find(parent, dest);

            if (set1 != set2) {
                System.out.println(src + " -- " + dest + " == " + weight);
                union(parent, set1, set2);
                count++;
            }
        }
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