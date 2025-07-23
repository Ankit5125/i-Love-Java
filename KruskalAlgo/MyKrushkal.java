package KruskalAlgo;

import java.util.Arrays;

public class MyKrushkal {

    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {
            {0, 1, 10}, {0, 2, 6}, {0, 3, 5}, {1, 3, 15}, {2, 3, 4}
        };

        int[] parent = new int[V];
        for (int i = 0; i < parent.length; i++)
            parent[i] = i;

        Arrays.sort(edges, (a,b) -> a[2] - b[2]);
        //  {2, 3, 4}, {0, 3, 5},  {0, 2, 6}, {0, 1, 10}, {1, 3, 15},

        System.out.println("Minimum Spanning Tree : ");
        int count = 0;
        int tcost = 0;
        for (int i = 0; i < edges.length && count < V -1 ; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];
            int weight = edges[i][2];

            int set1 = find(parent, src);
            int set2 = find(parent, dest);

            if (set1 != set2) {
                System.out.println(src + "-" + dest + " : " + weight);
                union(parent, set1, set2);
                tcost += weight;
                count++;
            }
        }

        System.out.println("Total Weight : " + tcost);

    }

    static int find(int[] parent, int i){
        while (parent[i] != i) {
            i = parent[i];
        }
        return i;
    }

    static void union(int[] parent, int x, int y){
        parent[x] = y;
    }
}
