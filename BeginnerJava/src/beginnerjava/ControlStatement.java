package beginnerjava;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.printf("Enter an Integer number: ");
        num = input.nextInt();

        if(num>0){
            System.out.printf("%d is a positive number!", num);
        } else if (num<0) {
            System.out.printf("%d is a negative number!", num);
        }else {
            System.out.printf("Zero!");
        }

    }
}
