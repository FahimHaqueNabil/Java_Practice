package beginnerjava;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.printf("Enter a positive integer: ");
        num = input.nextInt();

        if(num%2==0 && num>0){
            System.out.printf("%d is Even number!", num);
        }else if(num%2==1 && num>0){
            System.out.printf("%d is Odd number!", num);
        } else if (num == 0) {
            System.out.println("Zero!!!");
        } else {
            System.out.printf("%d is a Negative number!!!", num);
        }
    }
}
