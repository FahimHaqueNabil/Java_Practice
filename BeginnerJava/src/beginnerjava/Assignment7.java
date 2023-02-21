package beginnerjava;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;

        System.out.println("Do you love Java?");
        System.out.printf("If YES press \'y\' or \'Y\' else press \'n\' or \'N\': ");
        ch = input.next().charAt(0);

        if(ch == 'y' || ch == 'Y'){
            System.out.println("You're a Java Lover!");
        } else if (ch == 'n' || ch == 'N') {
            System.out.println("You're not a Java lover!");
        }else {
            System.out.println("Invalid Input!");
        }

    }
}
