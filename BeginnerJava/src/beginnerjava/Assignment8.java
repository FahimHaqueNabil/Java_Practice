package beginnerjava;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1, ch2;

        System.out.println("Have you completed your masters?");
        System.out.printf("Enter your answer (y / n): ");
        ch1 = input.next().charAt(0);

        System.out.println("Are you fluent in English?");
        System.out.printf("Enter your answer (y / n): ");
        ch2 = input.next().charAt(0);

        if(ch1 == 'y' && ch2 == 'y'){
            System.out.println("You're eligible for the job interview!");
        } else if (ch1 == 'y' && ch2 == 'n') {
            System.out.println("Sorry... You're not eligible for the job interview");
        }else if (ch1 == 'n' && ch2 == 'y') {
            System.out.println("Sorry... You're not eligible for the job interview");
        }else if (ch1 == 'n' && ch2 == 'n') {
            System.out.println("Sorry... You're not eligible for the job interview");
        }else {
            System.out.println("Wrong input...");
        }


    }
}
