package beginnerjava;

import java.util.Scanner;

public class VowelConsonantDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;

        System.out.printf("Enter any letter: ");
        c = input.next().charAt(0); //nabil -> n

        if(c=='a' ||c=='e' || c=='i' || c=='o'|| c=='u' || c=='A' ||c=='E' || c=='I' || c=='O'|| c=='U'){
            System.out.println("Vowel!");
        }else {
            System.out.println("Consonant!");
        }

    }
}
