package arraydemo;

public class Array6 {
    public static void main(String[] args) {
        int[][] A = new int[4][5];
        int k = 0;

        // Assign Value
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 5; col++){
                A[row][col] = k;
                k++;
            }
        }

        // Printing matrix
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 5; col++){
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }

    }
}
