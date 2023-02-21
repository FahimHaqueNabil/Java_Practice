package arraydemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size of array list: "+number.size());

        // adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(0, 40);

        System.out.println(number);
        System.out.println("Size of array list: "+number.size());

        for(int x: number){
            System.out.print(" "+x);
        }
        System.out.println();
        System.out.println("Size of array list: "+number.size());

        Iterator itr = number.iterator();
        while (itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        System.out.println("Size of array list: "+number.size());

        // contains
        boolean pos = number.contains(40);
        System.out.println("40 is in the list?: "+pos);

        // index of
        int i = number.indexOf(40);
        System.out.println("Index of 40 is: "+i);

        // SET or replace
        number.set(3, 50);
        System.out.println(number);

        // GET
        int j = number.get(3);
        System.out.println(j);

        // Removing elements
        number.remove(2);
        System.out.println(number);
        System.out.println("Size of array list: "+number.size());

        boolean check = number.isEmpty();
        System.out.println("Array List empty?: "+check);

        number.clear(); // number.removeAll(number);
        System.out.println(number);
        System.out.println("Size of array list: "+number.size());

        check = number.isEmpty();
        System.out.println("Array List empty?: "+check);


    }
}
