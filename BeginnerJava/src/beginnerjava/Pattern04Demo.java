package beginnerjava;

import java.util.Scanner;

public class Pattern04Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        // 1
        for(int row = 1; row <= n; row++){
            // printing Space
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
        for(int row = 1; row <= n; row++){
            // printing Space
            for (int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            // print Numbers
            for (int col = 1; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }

        // 3
        for(int row = 1; row <= n; row++){
            // printing Space
            for (int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            // print Letters
            for (int col = 1; col <= row; col++){
                System.out.printf("%c",col+64);
            }
            System.out.println();
        }
        System.out.println();

        // 4
        for(int row = 1; row <= n; row++){
            // printing Space
            for (int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            // print Letters
            for (int col = 1; col <= row; col++){
                System.out.printf("%c",row+64);
            }
            System.out.println();
        }
        System.out.println();

        // 5
        for(int row = 1; row <= n; row++){
            // printing Space
            for (int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            // print Stars
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}
