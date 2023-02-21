package callby_reference;

public class callByReference {

    String name;
    void change(callByReference n2){
        n2.name = "Hitman";
    }
}
