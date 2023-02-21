package encapsulation;

public class test {
    public static void main(String[] args) {
        person p1 = new person();

        p1.setName("Nabil");
        p1.setAge(25);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}
