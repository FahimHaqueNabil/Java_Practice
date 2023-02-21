package beginnerjava;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {

        double base, height, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base: ");
        base = input.nextDouble();

        System.out.print("Enter Height: ");
        height = input.nextDouble();

        area = 0.5 * base * height;
        System.out.printf("Area of Triangle: %.2f",area);
    }
}
