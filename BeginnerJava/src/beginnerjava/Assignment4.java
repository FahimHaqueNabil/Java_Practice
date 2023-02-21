package beginnerjava;

import java.util.Scanner;
// Create a program to calculate installment amount for per month
public class Assignment4 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int phonePrice = 1800; // 1800 euros
            int numberOfInstallment;
            double installmentPerMonth;


            // get number of installments from user
            Scanner inputNumberOfInstallment = new Scanner(System.in);
            System.out.print("Number of installments? -> ");
            numberOfInstallment = inputNumberOfInstallment.nextInt();


            // calculate  installment amount for per month
            installmentPerMonth = (double) phonePrice / numberOfInstallment;


            System.out.printf("Monthly installment Amount: %.2f euros",installmentPerMonth);
        }

    }
}