package DFS_BFS;

import java.util.Scanner;

public class DFS {

    static boolean[] isVisited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter (N) : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        System.out.println("Enter " + n + " Elements : ");
        

        isVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                dfs(arr, i);
            }
        }

        // adhuro cheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
        sc.close();
    }

    static void dfs(int[][] arr, int index){
        isVisited[index] = true;
    }
}
