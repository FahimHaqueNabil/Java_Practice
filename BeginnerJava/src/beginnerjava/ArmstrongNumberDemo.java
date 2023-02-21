package beginnerjava;

import java.util.Scanner;

public class ArmstrongNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, temp, remainder, sum = 0;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        temp = num;

        while (temp != 0){
            remainder = temp % 10;
            sum =  sum + remainder * remainder * remainder;
            temp = temp/ 10;
        }

        if(num == sum){
            System.out.println(sum+" Armstrong Number!");
        }else {
            System.out.println(sum+" Not a Armstrong Number...");
        }

    }
}
