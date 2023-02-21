package callby_value;

public class test {
    public static void main(String[] args) {
        callByValue ob = new callByValue();

        int x = 10;

        System.out.println("Before: "+x);

        ob.change(x);
        System.out.println("After: "+x);

    }
}
