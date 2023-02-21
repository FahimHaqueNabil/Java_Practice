package beginnerjava;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, temp, totalArmstrongNumber = 0;

        System.out.print("Enter starting number: ");
        m = input.nextInt();

        System.out.print("Enter ending number: ");
        n = input.nextInt();


        for(int i = m; i <= n; i++){
            temp = i;
            int sum = 0, remainder;

            while (temp != 0){
                remainder = temp % 10;
                sum =  sum + remainder * remainder * remainder;
                temp = temp/ 10;
            }
            if(i == sum){
                System.out.print(sum+ " ");
                totalArmstrongNumber++;
            }
        }

        System.out.println();
        System.out.println("Total Armstrong Number: "+totalArmstrongNumber);

    }
}
