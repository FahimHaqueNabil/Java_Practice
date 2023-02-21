package interface_multiple_inheritance;

public class C implements A,B{

    @Override
    public void play() {
        System.out.println("I\'m from C");
    }
}
