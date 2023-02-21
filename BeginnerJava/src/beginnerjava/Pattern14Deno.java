package beginnerjava;

import java.util.Scanner;

public class Pattern14Deno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                if(row == 1 || row == n || col == 1 || col == n){
                    System.out.print("*");
                }else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
