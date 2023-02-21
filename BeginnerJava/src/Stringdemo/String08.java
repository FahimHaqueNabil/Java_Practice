package Stringdemo;

public class String08 {
    public static void main(String[] args) {

        // PRIMITIVE ---> Object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        Integer z = x; // Integer.valueOf(x)
        System.out.println(z);

        // Object ---> Primitive
        Double d = new Double(10.25);
        System.out.println(d);

        double e = d; // d.doubleValue()
        System.out.println(e);

    }
}
