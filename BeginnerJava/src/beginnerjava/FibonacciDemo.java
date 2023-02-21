package beginnerjava;

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 1, fibo, n;

        System.out.print("How many Numbers?: ");
        n = input.nextInt();


        for (int i = 1; i <= n; i++){
            System.out.print(first+" ");

            fibo = first+second;
            first = second;
            second = fibo;
        }



    }

}
