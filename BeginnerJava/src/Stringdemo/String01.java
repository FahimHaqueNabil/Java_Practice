package Stringdemo;

public class String01 {
    public static void main(String[] args) {
        String s1 = "Fahim Haque Nabil";
        String s2 = new String("fahim haque nabil");

        char[] s3 = {'h','e','l','l','o'};

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int len = s1.length();
        System.out.println("Length of s1: "+len);

        if (s1.equalsIgnoreCase(s2) ){
            System.out.println("Equals");
        }else {
            System.out.println("Not equals");
        }

        boolean b = s1.contains("Nab");
        System.out.println(b);

        boolean b2 = s1.isEmpty();
        System.out.println(b2);

    }
}
