package Stringdemo;

public class String07 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Fahim Haque Nabil");
        System.out.println(str);

        str.append(" Hitman");
        str.append(341);
        System.out.println(str);

//        str.reverse();
//        System.out.println(str);

        str.delete(5,11);
        System.out.println(str);

    }
}
