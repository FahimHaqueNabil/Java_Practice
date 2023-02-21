package abstraction;

abstract public class MobileUser {

    abstract void sendMessage();

    void call(){       // Non-abstract method
        System.out.println("Calling");
    }
}
