package arraydemo;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sumOfDiagonalElements = 0, sumOfUpperElements = 0, sumOfLowerElements = 0;

        // Getting input of A matrix
        System.out.print("Enter input of A matrix: ");
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                A[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                if (row == col){
                    sumOfDiagonalElements += A[row][col];
                }
                if (row < col){
                    sumOfUpperElements += A[row][col];
                }
                if(row > col){
                    sumOfLowerElements += A[row][col];
                }
            }
        }

        System.out.println("Sum of Diagonal Elements: "+sumOfDiagonalElements);
        System.out.println("Sum of Upper Elements: "+sumOfUpperElements);
        System.out.println("Sum of Lower Elements: "+sumOfLowerElements);


    }
}
