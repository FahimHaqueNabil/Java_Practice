package beginnerjava;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, result = 1;

        System.out.print("Enter a positive number: ");
        n = input.nextInt();

        for (i = 1; i <= n; i++){
            result *= i;
        }
        System.out.printf("Factorial is: %d", result);

    }
}
