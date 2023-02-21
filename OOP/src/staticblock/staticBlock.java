package staticblock;

public class staticBlock {

    static int id;
    static String name;

    static {
        id = 181;
        name = "Nabil";
    }

    static void display(){
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        staticBlock.display();

    }

}
