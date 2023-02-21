package beginnerjava;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, name ="nabil", pass ="123" ;

       while (true){
        System.out.print("Enter User Name: ");
        username = input.nextLine();
        System.out.print("Enter Password: ");
        password = input.nextLine();

        if (username.equals(name)  && password.equals(pass) ){
            System.out.println("Welcome to the system!");
            break;
        }else {
            System.out.println("Username or Password is incorrect...");
        }

        }

    }
}
