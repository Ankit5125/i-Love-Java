package LearningGraph;

import java.util.ArrayList;
import java.util.List;

public class LeaningGraph {
    public static void main(String[] args) {

        int n = 3;

        int[][] edges = {
                { 0, 2, 10 }, { 1, 2, 7 }, { 1, 0, 15 }
        };
        
        // undirected
        System.out.println("Undirected Graph : ");
        MyGraph graph = new MyGraph(n);
        graph.addEdges(edges, false);
        graph.printList();
        
        // directed
        System.out.println("Directed Graph : ");
        MyGraph graph2 = new MyGraph(n);
        graph2.addEdges(edges, true);
        graph2.printList();


        // undirected
        System.out.println("Undirected Graph : ");
        MyGraph graph3 = new MyGraph(n);
        graph3.addEdgeWithWeight(edges, false);
        graph3.printList();
        
        // directed
        System.out.println("Directed Graph : ");
        MyGraph graph4 = new MyGraph(n);
        graph4.addEdgeWithWeight(edges, true);
        graph4.printList();
    }
}
 
class MyGraph{
    List<List<Integer>> adjList;
 
    MyGraph(int n){
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdges(int[][] edges, boolean isDirected){
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (isDirected) {
                adjList.get(u).add(v);
            }
            else{
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void addEdgeWithWeight(int[][] edges, boolean isDirected){
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if (isDirected) {
                adjList.get(u).add(weight);
            }
            else{
                adjList.get(u).add(weight);
                adjList.get(v).add(weight);
            }
        }
    }

    public void printList(){
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println(i + " -> " + adjList.get(i));
        }
    }
}