package beginnerjava;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.printf("Enter your age: ");
        age = input.nextInt();

        if(age>=18){
            System.out.println("You're a valid Voter!");
        }else {
            System.out.println("You're not a valid Voter!!!");
        }

    }
}
