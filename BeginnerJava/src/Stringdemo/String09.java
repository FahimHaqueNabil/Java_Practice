package Stringdemo;

public class String09 {
    public static void main(String[] args) {
        // Primitive ---> String
        double i = 100.25;
        String s = Double.toString(i);
        System.out.println(s);

        boolean b = true;
        String s1 = Boolean.toString(b);
        System.out.println(s1);


        // String --> Boolean
        String s2 = "423";
        int x = Integer.parseInt(s2);
        System.out.println(x);

        double y = Double.parseDouble(s2);
        System.out.println(y);

    }
}
