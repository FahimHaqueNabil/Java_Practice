package beginnerjava;

import java.util.Scanner;
public class Pattern02Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        // 1
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        // 2
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }

        // 3
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print(col%2+" ");
            }
            System.out.println();
        }

        // 4
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print(row%2+" ");
            }
            System.out.println();
        }

        // 5
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.printf("%c ",col+64);
            }
            System.out.println();
        }

        // 6
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.printf("%c ",row+64);
            }
            System.out.println();
        }

        // 7
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.printf("%c ",col+96);
            }
            System.out.println();
        }

        // 8
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.printf("%c ",row+96);
            }
            System.out.println();
        }

        // 9
        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


    }
}
