import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static int[][] graph;
    static boolean[] visited;

    // BFS algorithm implementation
    public static void bfs(int start, int numNodes) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < numNodes; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
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

        System.out.println("BFS Traversal:");
        bfs(start, numNodes);
    }
}
