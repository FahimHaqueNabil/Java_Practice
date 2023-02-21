package beginnerjava;

import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c, f;

        System.out.print("Enter Celsius: ");
        c = input.nextDouble();

        f = 1.8 * c + 32;
        System.out.println("Fahrenheit: "+f);

        System.out.print("Enter Fahrenheit: ");
        f = input.nextDouble();

        c = 0.56 * (f - 32);
        System.out.println("Celsius: "+c);
    }
}
