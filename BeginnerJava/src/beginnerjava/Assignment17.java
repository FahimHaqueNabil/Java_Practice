package beginnerjava;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for(int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col%2);
            }
            System.out.println();
        }

    }
}
