import java.util.*;

public class DFS {
    static int[][] graph;
    static boolean[] visited;

    // Recursive DFS function
    public static void dfs(int v, int n) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 0; i < n; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                dfs(i, n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();

        graph = new int[n][n];
        visited = new boolean[n];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter starting node:");
        int start = sc.nextInt();

        System.out.println("DFS traversal:");
        dfs(start, n);
        sc.close();
    }
}
