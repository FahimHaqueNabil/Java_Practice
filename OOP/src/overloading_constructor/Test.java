package overloading_constructor;

public class Test {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Nabil", "M");
        teacher2.displayInfo();

        Teacher teacher3 = new Teacher("Hitman", "M", 341);
        teacher2.displayInfo();


    }
}
