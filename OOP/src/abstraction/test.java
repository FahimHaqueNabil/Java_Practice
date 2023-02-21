package abstraction;

public class test {
    public static void main(String[] args) {
        MobileUser mu; // reference variable

        mu = new Nabil();
        mu.sendMessage();
        mu.call();

        mu = new Hitman();
        mu.sendMessage();
//        mu.call();
    }
}
