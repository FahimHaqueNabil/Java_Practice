package beginnerjava;

import java.util.Scanner;

public class SeriesDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        double sum2 = 0;

        System.out.print("Enter the n-th number: ");
        n = input.nextInt();

        // 1 + 2 + 3 + 4 + .... + n
        System.out.print("1. The Series is: ");
        for (int i =1; i <= n; i++){
            System.out.printf("%d ", i);
            sum +=i;
        }
        System.out.println();
        System.out.println("The sum is: "+sum);

        sum = 0;

        // 1 + 3 + 5 + 7 + .... + n
        System.out.print("2. The Series is: ");
        for (int i =1; i <= n; i = i+2){
            System.out.printf("%d ", i);
            sum +=i;
        }
        System.out.println();
        System.out.println("The sum is: "+sum);

        sum = 0;

        // 2 + 4 + 6 + 8 + .... + n
        System.out.print("3. The Series is: ");
        for (int i =2; i <= n; i = i+2){
            System.out.printf("%d ", i);
            sum +=i;
        }
        System.out.println();
        System.out.println("The sum is: "+sum);

        sum = 0;

        // 1.5 + 3.5 + 5.5 + 7.5 + .... + n
        System.out.print("3. The Series is: ");
        for (double i =1.5; i <= n; i++){
            System.out.printf("%.1f ", i);
            sum2 +=i;
        }
        System.out.println();
        System.out.println("The sum is: "+sum2);

        // 1^2 + 2^2 + 3^2 + 4^2 + .... + n^2
        System.out.print("4. The Series is: ");
        for (int i =1; i <= n; i++){
            System.out.printf("%d^%d ", i,i);
            sum += i*i;
        }
        System.out.println();
        System.out.println("The sum is: "+sum);

    }
}
