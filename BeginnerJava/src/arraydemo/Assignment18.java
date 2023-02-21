package arraydemo;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] weekdays = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};

        System.out.print("Enter any number from 1 to 7: ");
        int num = input.nextInt();

        for (int  i = 1; i <= weekdays.length; i++){
            if(i == num){
                System.out.println(weekdays[i-1]);
            }
        }

    }
}
