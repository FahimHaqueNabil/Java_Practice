package beginnerjava;

import java.util.Scanner;

public class Pattern18Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count = 0;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++){
            // Space
            for (int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }
            // Numbers
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            for (int col = row-1; col >= 1; col--){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
