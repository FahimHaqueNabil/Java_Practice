package beginnerjava;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {

        int number;
        String name;
        double number2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = input.nextInt();

        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter any name: ");
        name = inputName.nextLine();

        Scanner inputNumber2 = new Scanner(System.in);
        System.out.print("Enter a double type number: ");
        number2 = inputNumber2.nextDouble();

        System.out.println("Number: "+number);
        System.out.println("Welcome: "+name);
        System.out.println("Number 02: "+number2);
    }
}
