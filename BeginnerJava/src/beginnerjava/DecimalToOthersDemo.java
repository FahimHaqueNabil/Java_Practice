package beginnerjava;

import java.util.Scanner;

public class DecimalToOthersDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal;

        System.out.print("Enter a number: ");
        decimal = input.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary: "+binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: "+octal);

        String hexa = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: "+hexa);


    }
}
