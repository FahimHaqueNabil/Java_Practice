package arraydemo;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        // getting input for A matrix
        System.out.println("Enter input for A: ");
        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.printf("A[%d][%d]: ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        // getting input for B matrix
        System.out.println("Enter input for B: ");
        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.printf("B[%d][%d]: ", row, col);
                B[row][col] = input.nextInt();
            }
        }

        // printing A matrix
        System.out.println("A:");
        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }

        // printing B matrix
        System.out.println("B:");
        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(" "+B[row][col]);
            }
            System.out.println();
        }

        // ADDING A & B matrix and printing C matrix
        System.out.println("C:");
        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                C[row][col] = A[row][col] + B[row][col];
                System.out.print(" "+C[row][col]);
            }
            System.out.println();
        }

    }
}
