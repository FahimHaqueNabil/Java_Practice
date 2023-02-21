package Stringdemo;

public class String02 {
    public static void main(String[] args) {
        String firstName = "Fahim Haque ";
        String lastName = "Nabil";

        String fullName = firstName.concat(lastName);
        System.out.println("Full name: "+fullName);

        String upper = fullName.toUpperCase();
        String lower = fullName.toLowerCase();

        System.out.println("Upper: "+upper);
        System.out.println("Lower: "+lower);

        boolean b = firstName.startsWith("fa");
        System.out.println(b);

        boolean b2 = lastName.endsWith("il");
        System.out.println(b2);

        String[] name = {"fahim", "nabil", "hitman"};
        for (String x: name){
            System.out.print(x+" ");
        }

    }
}
