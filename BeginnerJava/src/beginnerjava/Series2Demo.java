package beginnerjava;

import java.util.Scanner;

public class Series2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  n, result = 1;

        System.out.print("Enter the n-th number: ");
        n = input.nextInt();

        System.out.print("1. The Series is: ");
        // 1 * 2 * 3 * 4 * .... * n
        for (int i =1; i <= n; i++){
            System.out.printf("%d ", i);
            result *=i;
        }
        System.out.println();
        System.out.println("The result is: "+result);

        result = 1;

        // 1 * 3 * 5 * 7 * .... * n
        System.out.print("2. The Series is: ");
        for (int i =1; i <= n; i = i+2){
            System.out.printf("%d ", i);
            result *=i;
        }
        System.out.println();
        System.out.println("The sum is: "+result);

    }
}
