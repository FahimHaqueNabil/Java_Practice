package arraydemo;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0, average = 0, max, min;

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < number.length; i++){
            number[i] = input.nextDouble();
        }

        for (int i = 0; i < number.length; i++){
            sum += number[i];
            average = sum/number.length;
        }
        System.out.println("Sum of the array: "+sum);
        System.out.println("Average: "+average);

        // Maximum & Minimum
        max = number[0];
        for (int i = 1; i < number.length; i++){
            if (max < number[i]){
                max = number[i];
            }
        }
        System.out.println("Maximum: "+max);

        min = number[0];
        for (int i = 1; i < number.length; i++){
            if (min > number[i]){
                min = number[i];
            }
        }
        System.out.println("Minimum: "+min);

    }
}
