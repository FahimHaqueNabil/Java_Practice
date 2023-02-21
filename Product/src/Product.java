import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        int id;
        String title, description, category;
        double price;

        Scanner inputID = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        id = inputID.nextInt();

        Scanner inputTitle = new Scanner(System.in);
        System.out.print("Enter a title: ");
        title = inputTitle.nextLine();

        Scanner inputPrice = new Scanner(System.in);
        System.out.print("Enter the price: ");
        price = inputPrice.nextDouble();

        Scanner inputDescription = new Scanner(System.in);
        System.out.print("Enter the description: ");
        description = inputDescription.nextLine();

        Scanner inputCategory = new Scanner(System.in);
        System.out.print("Enter the category: ");
        category = inputCategory.nextLine();

        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.printf("Price: %.2f euro\n",price);
        System.out.println("Description: "+description);
        System.out.println("Category: "+category);
    }
}
