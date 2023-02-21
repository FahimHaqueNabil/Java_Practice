package beginnerjava;

import java.util.Scanner;

public class SumOfDigitsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, temp, remainder, sum = 0;

        System.out.print("Enter any positive integer: ");
        num = input.nextInt();

        temp = num;

        while (temp != 0){
            remainder = temp%10;
            sum += remainder;
            temp = temp/10;
        }
        System.out.println("Sum of Digits: "+sum);

    }
}
