import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class DFS_BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input graph
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        System.out.println("Enter edges (u v): ");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // undirected
        }

        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        // DFS
        boolean[] visitedDFS = new boolean[V];
        System.out.print("DFS: ");
        dfs(start, adj, visitedDFS);
        System.out.println();

        // BFS
        System.out.print("BFS: ");
        bfs(start, adj, V);
        System.out.println();

        sc.close();
        // Enter number of vertices: 5
        // Enter number of edges: 6
        // Enter edges (u v):
        // 0 1
        // 0 2
        // 1 3
        // 2 3
        // 3 4
        // 1 4
        // Enter starting node: 0

    }

    // DFS (recursive)
    static void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                dfs(neigh, adj, visited);
            }
        }
    }

    // BFS (iterative)
    static void bfs(int start, List<List<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int neigh : adj.get(node)) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
        }
    }
}
