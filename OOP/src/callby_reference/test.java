package callby_reference;

public class test {
    public static void main(String[] args) {
        callByReference ob = new callByReference();
        ob.name = "Nabil";

        System.out.println("Before: "+ob.name);

        ob.change(ob);
        System.out.println("After: "+ob.name);
    }
}
