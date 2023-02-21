package arraydemo;


import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int [] num = {10, -4, -77, 66, 23};

        Arrays.sort(num);

        System.out.print("Ascending: ");
        for (int i = 0; i < num.length; i++){
            System.out.print(" "+num[i]);
        }
        System.out.println();

        System.out.print("Descending: ");
        for (int i = num.length - 1; i >= 0; i--){
            System.out.print(" "+num[i]);
        }
        System.out.println();

        String[] names = {"Nabil", "Hitman", "Fahim", "Sama", "Bhaia"};
        Arrays.sort(names);

        System.out.print("Sorted: ");
        for (int i = 0; i < names.length; i++){
            System.out.print(" "+names[i]);
        }
        System.out.println();

        System.out.print("Reverse Sorted: ");
        for (int i = names.length-  1; i >= 0; i--){
            System.out.print(" "+names[i]);
        }

    }
}
