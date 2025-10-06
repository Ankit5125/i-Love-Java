import java.util.LinkedList;

import java.util.*;

public class BFS {
    static int[][] graph;
    static boolean[] visited;

    public static void bfs(int start, int numNodes) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        System.out.println("Node\tQueue");
        System.out.println("-----------------");

        while (!queue.isEmpty()) {
            // Print the current node and the queue before processing
            System.out.print(queue.peek() + "\t");

            int node = queue.poll();

            // Find unvisited neighbors and add them to the queue
            for (int i = 0; i < numNodes; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
            // Print the queue state after adding new nodes
            System.out.println(queue.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int numNodes = sc.nextInt();

        graph = new int[numNodes][numNodes];
        visited = new boolean[numNodes];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter starting node:");
        int start = sc.nextInt();

        System.out.println("\nBFS Traversal Table:");
        bfs(start, numNodes);
        
        sc.close();
    }
}