package beginnerjava;

import java.util.Scanner;

public class Pattern16Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if( row == col || row+col == n+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
