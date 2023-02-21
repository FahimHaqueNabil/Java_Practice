package Stringdemo;

public class String05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Fahim Haque Nabil");
        System.out.println(sb);

        sb.append(" Hitman");
        sb.append(341);

        System.out.println(sb);

//        sb.reverse();
//        System.out.println(sb);

//        sb.delete(0,5);
//        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);

    }
}
