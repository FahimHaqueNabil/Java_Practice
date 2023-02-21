package beginnerjava;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("Select your preferred language: 1. Bangla, 2. English, 3. Hindi, 4. Deutsch");
        System.out.printf("Your preferred language: ");
        option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Selected language is Bangla");
                break;
            case 2:
                System.out.println("Selected language is English");
                break;
            case 3:
                System.out.println("Selected language is Hindi");
                break;
            case 4:
                System.out.println("Selected language is Deutsch");
                break;
            default:
                System.out.println("Wrong input...");

        }


    }
}
