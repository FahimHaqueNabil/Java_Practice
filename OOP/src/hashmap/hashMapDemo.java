package hashmap;

import java.util.HashMap;

public class hashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String > customer = new HashMap<Integer, String>();

        customer.put(201, "Nabil");
        customer.put(202, "Sama");
        customer.put(203, "Hitman");

        System.out.println(customer.get(201));
        System.out.println(customer.get(203));
        System.out.println(customer.get(202));
    }
}
