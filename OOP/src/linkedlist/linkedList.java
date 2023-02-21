package linkedlist;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();
        countryNames.add("Bangladesh");
        countryNames.add("Germany");
        countryNames.add("Australia");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");

        countryNames.add(3, "Brazil");

        countryNames.addFirst("USA");
        countryNames.addLast("Turkey");

//        countryNames.remove("Nepal");
        countryNames.remove(3);
//        countryNames.removeFirst();
//        countryNames.removeLast();

//        System.out.println(countryNames);

        for (String country: countryNames){
            System.out.println(country);
        }

        System.out.println("First element: "+countryNames.getFirst());
        System.out.println("Last element: "+countryNames.getLast());
        System.out.println("Index element: "+countryNames.get(2));


        System.out.println("Size of the LinkedList: "+countryNames.size());

        countryNames.clear();
        System.out.println(countryNames);


    }
}
