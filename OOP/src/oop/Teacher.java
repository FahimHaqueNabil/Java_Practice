package oop;

public class Teacher {

    String name, gender;
    int phone;

    // Constructor

    Teacher(){
        System.out.println("No value");
    }

    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }

    // Method
//    void setInformation(String n, String g, int p){
//        name = n;
//        gender = g;
//        phone = p;
//    }

    void displayInformation(){
        System.out.println("Name: "+name+", Gender: "+gender +", Phone: "+phone);
    }

}
