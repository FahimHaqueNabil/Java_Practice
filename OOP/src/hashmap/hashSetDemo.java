package hashmap;

import java.util.HashSet;

public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruitNames = new HashSet<>();

        fruitNames.add("Afpelsaft");
        fruitNames.add("Orangensaft");
        fruitNames.add("Banane");

        System.out.println(fruitNames);
        System.out.println(fruitNames.size());
    }
}
