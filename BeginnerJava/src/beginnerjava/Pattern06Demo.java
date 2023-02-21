package beginnerjava;

import java.util.Scanner;

public class Pattern06Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for(int row = 1; row <= n; row++){
            for (int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

        for(int row = n-1; row >= 1; row--){
            for (int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
