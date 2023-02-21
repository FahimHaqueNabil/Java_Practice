package beginnerjava;

import java.util.Scanner;

public class MultiplicationTableDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, result = 1;

        System.out.print("Enter starting Number: ");
        m = input.nextInt();

        System.out.print("Enter ending Number: ");
         n = input.nextInt();


        for (int i = m; i <=n; i++){
            System.out.println("Multiplication Table of  "+i);

            for (int j = 1; j <= 10; j++){
                result = j * i;
               System.out.println(i+" * "+j+"= "+result);
            }
            System.out.println();

        }

    }
}
