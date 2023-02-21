package beginnerjava;

import java.util.Scanner;

public class TotalPalindromeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, temp, remainder, totalPalindromeNumber = 0;

        System.out.print("Enter starting number: ");
        m = input.nextInt();
        System.out.print("Enter ending number: ");
        n = input.nextInt();

        System.out.print("Palindrome Numbers: ");

        for(int i =m; i <= n; i++){
            int reverse = 0;
            temp = i;

            while(temp != 0){
                remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp = temp/ 10;

            }
            if( i == reverse){
                System.out.print(" "+i);
                totalPalindromeNumber++;
            }
        }

        System.out.println();
        System.out.println("Total Palindrome Numbers: "+totalPalindromeNumber);


    }
}
