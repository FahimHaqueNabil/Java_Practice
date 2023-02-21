package beginnerjava;

import java.util.Scanner;

public class Pattern05Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        // 1
        for(int row = n; row >= 1; row--){
            // print Spaces
            for (int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            // print Numbers
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();

        // 2
        for(int row = n; row >= 1; row--){
            // print Spaces
            for (int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            // print Numbers
            for (int col = 1; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
        System.out.println();

        // 3
        for(int row = n; row >= 1; row--){
            // print Spaces
            for (int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            // print Numbers
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
