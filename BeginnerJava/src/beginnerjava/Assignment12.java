package beginnerjava;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, sum = 0;

        System.out.print("Enter starting number: ");
        m = input.nextInt();
        System.out.print("Enter ending number: ");
        n = input.nextInt();

        for(int i = m ; i <= n; i++){
            if(i%2 == 1){
                sum += i;
            }
        }
        System.out.printf("Sum of the ODD numbers from %d to %d is: %d", m, n, sum);

    }
}
