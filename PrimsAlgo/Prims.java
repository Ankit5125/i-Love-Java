package PrimsAlgo;

public class Prims {
    public static void main(String[] args) {

        int max = Integer.MAX_VALUE;

        // input 1
        // int[][] arr = {
        //         { max, 4, 3, max, max, max },
        //         { 4, 8, 1, 2, max, max },
        //         { 3, 1, max, 4, max, max },
        //         { max, 2, 4, max, 2, max },
        //         { max, max, max, 2, max, 6 },
        //         { max, max, max, max, 6, max } };
        
        // input 2
        int[][] arr = {
                { max, 6, 1, 5, max, max },
                { 6, max, 5, max, 3, max },
                { 1, 5, max, 5, 6, 4 },
                { 5, max, 5, max, max, 2 },
                { max, 3, 6, max, max, 6 },
                { max, max, 4, 2, 6, max },
        };

        int[] selected = { 1, 0, 0, 0, 0, 0 };

        int c = 0;
        int n = arr.length;
        int tCost = 0;

        System.out.println("Edges\t:\tCost");
        while (c < n - 1) {

            int x = 0;
            int y = 0;
            int min =max;

            for (int i = 0; i < arr.length; i++) {
                if (selected[i] == 1) {
                    for (int j = 0; j < arr[i].length; j++) {

                        if (selected[j] == 0) {
                            if (arr[i][j] < min) {
                                min = arr[i][j];
                                x = i;
                                y = j;
                            }
                        }

                    }
                }
            }

            System.out.println(x+ " - " + y + "\t:\t" + arr[x][y]);
            tCost += arr[x][y];
            selected[y] = 1;

            c++;
        }

        System.out.println("Total Cost = " + tCost);
    }
}

