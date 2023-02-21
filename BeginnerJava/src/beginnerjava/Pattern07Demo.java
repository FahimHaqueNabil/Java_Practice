package beginnerjava;

import java.util.Scanner;

public class Pattern07Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        // 1
        for (int row =1; row <=n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 2
        for (int row =1; row <=n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();


    }
}
