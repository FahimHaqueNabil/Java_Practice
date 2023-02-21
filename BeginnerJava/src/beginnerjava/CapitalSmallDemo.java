package beginnerjava;

import java.util.Scanner;

public class CapitalSmallDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;

        System.out.printf("Enter any letter: ");
        c = input.next().charAt(0);

        if(c >= 'a' && c <='z'){
            System.out.println("Small Letter!");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Capital Letter!");
        }else {
            System.out.println("Not a Letter!");
        }

    }
}
