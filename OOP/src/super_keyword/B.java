package super_keyword;

public class B extends A{
    int x = 5;

    @Override
    void display(){
        super.display();

        System.out.println("Inside B class");
        System.out.println("x: "+x);
        System.out.println("Super x: "+super.x);
    }
}
