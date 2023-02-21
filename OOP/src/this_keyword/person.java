package this_keyword;

public class person {
    String name, hairColor;
    int age;


    person(String name, int age){
        this.name = name;
        this.age = age;
    }

    person(String name, int age, String hairColor){
        this(name, age);
        this.hairColor = hairColor;
    }

    void message(){
        System.out.println("I am message method");
    }

    void display(){
        this.message();
        System.out.println("I am display method");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Hair Color: "+hairColor);
    }
}
