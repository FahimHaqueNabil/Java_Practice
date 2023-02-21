package beginnerjava;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 1, fibo = 0, n;

        System.out.print("Which n-th number you want to see?: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            fibo = first+second;
            first = second;
            second = fibo;
        }
        System.out.println(first);

    }
}
