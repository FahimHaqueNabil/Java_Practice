package file;

import java.util.Formatter;
import java.util.Scanner;

// Write in a file

public class fileDemo2 {
    public static void main(String[] args) {
        String id, name;
        Scanner input = new Scanner(System.in);

        try {
            Formatter formatter = new Formatter("C:/Users/fahim/IdeaProjects/OOP/person/Student.txt");

            System.out.print("How many Students: ");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++){
                System.out.print("Enter Student ID: ");
                id = input.next();
                System.out.print("Enter Student Name: ");
                name = input.next();

                formatter.format("%s %s\r\n", id, name);
            }
            formatter.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
