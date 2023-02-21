package anonymous_class;

public class test {
    public static void main(String[] args) {
        person p = new person(){
            @Override
            void display() {
                System.out.println("Override to Test class");
            }
        };

        p.display();
    }
}
