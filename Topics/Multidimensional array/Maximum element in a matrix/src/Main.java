import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get user input n, m    }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // create 2D Array with input
        int matrix [][] = new int [n][m];

        // fill array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            matrix[i][j] = sc.nextInt();}
        }
        // set minimum initial value for comparison
        int greatestItem = Integer.MIN_VALUE;

        // initialize output variables
        int maxRow = 0;
        int maxCol = 0;

        // iterate through array to find greatestItem
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                // store greatestItem value and the first row and column indices where it was found
                if (matrix[i][j] > greatestItem) {
                    greatestItem = matrix[i][j];
                    maxRow = i;
                    maxCol = j;

                }
            }
        }

        System.out.println(maxRow + " " + maxCol);
    }


}