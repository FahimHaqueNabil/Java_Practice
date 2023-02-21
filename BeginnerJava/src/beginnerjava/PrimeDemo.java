package beginnerjava;

import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0;

        System.out.print("Enter any positive Integer: ");
        num = input.nextInt();

        if (num == 0 || num == 1){
            System.out.println("Not a prime number...");

        }else {
            for (int i = 2; i <= num/2; i++){
                if (num%i == 0){
                    count++;
                    break;
                }
            }

            if (count == 0){
                System.out.println("Prime Number!");
            }else {
                System.out.println("Not a prime number...");
            }
        }



    }
}
