package staticmethod;

public class staticMethod {

    static int x = 10;

    void display1(){
        System.out.println("I'm non static method...");
        display2();
    }
    static void display2(){
        System.out.println("I'm static method!");
//        display1();
        System.out.println(x);
    }
}
