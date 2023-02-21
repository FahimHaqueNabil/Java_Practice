package polymorphism;

public class test {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();

//        Teacher t = new Teacher();
//        t.display();

        p = new Teacher();
        p.display();

//        Student s = new Student();
//        s.display();

        p = new Student();
        p.display();
    }
}
