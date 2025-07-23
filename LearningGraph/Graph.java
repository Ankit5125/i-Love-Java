package LearningGraph;

public class Graph {

    static int[][] adjMatrix;

    Graph(int nodes) {
        adjMatrix = new int[nodes][nodes];
    }

    public void addEdgesInMatrix(int[][] edges, boolean isDirected){
        // edges = [[0,2], [1,2], [1,0]]
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if (isDirected) {
                adjMatrix[u][v] = 1;
            }
            else{
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }

    public void printMatrix(){
        for (int[] row : adjMatrix) {
            for (int ele : row) {
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }

    public void addEdgeWithWeight(int[][] edges, boolean isDirected){
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            // int weight = edge[2];

            if (isDirected) {
                adjMatrix[u][v] = edge[2];
            }
            else{
                adjMatrix[u][v] = edge[2];
                adjMatrix[v][u] = edge[2];
            }
        }
    }

    public static void main(String[] args) {

        // int[][] edges = {
        //     {0,2},{1,2},{1,0}
        // };

        int nodes = 3;

        // System.out.println("Undirected : ");
        // // undirected
        // Graph graph = new Graph(nodes);
        // graph.addEdgesInMatrix(edges, false);
        // graph.printMatrix();

        // System.out.println("Directed : ");
        // // directed
        // Graph graph2 = new Graph(nodes);
        // graph2.addEdgesInMatrix(edges, true);
        // graph2.printMatrix();

         int[][] edges = {
            {0,2,10},{1,2,7},{1,0,15}
        };

        System.out.println("Directed Graph with Weight: ");
        Graph graph = new Graph(nodes);
        graph.addEdgeWithWeight(edges, false);
        graph.printMatrix();

        System.out.println("Undirected Graph with Weight: ");
        Graph graph2 = new Graph(nodes);
        graph2.addEdgeWithWeight(edges, true);
        graph2.printMatrix();
    }
}