package inheritance;

public class test {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.setName("Nabil");
        t1.setAge(25);
        t1.setQualification("BSC");

        t1.displayInfo2();

        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getQualification());
    }
}
