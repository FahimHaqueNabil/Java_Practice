package method_override;

public class test {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.name = "Nabil";
        t1.age = 25;
        t1.qualification = "BSC";

        t1.displayInfo();

        person p1 = new person();
        p1.name = "HITMAN";
        p1.age = 26;

        p1.displayInfo();
    }
}
