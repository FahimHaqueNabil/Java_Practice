package beginnerjava;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {

        int num1, num2;
        double result;

        Scanner inputNum1 = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        num1 = inputNum1.nextInt();

        Scanner inputNum2 = new Scanner(System.in);
        System.out.print("Enter Number 2: ");
        num2 = inputNum2.nextInt();

        result = num1 + num2;
        System.out.printf("Addition: %.2f\n",result);

        result = num1 - num2;
        System.out.printf("Subtraction: %.2f\n",result);

        result = num1 * num2;
        System.out.printf("Multiplication: %.2f\n",result);

        result = (double) num1 / num2;
        System.out.printf("Division: %.2f\n",result);

        result = num1 % num2;
        System.out.printf("Remainder: %.2f",result);

    }
}
