package beginnerjava;

import java.util.Scanner;

public class Pattern17Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count = 0;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <=row; col++){
                count++;
                System.out.print(" "+count);
            }
            System.out.println();
        }

    }
}
