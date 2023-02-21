package arraydemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(45);
        number.add(-32);
        number.add(423);
        number.add(40);
        number.add(5);

        System.out.print("Before sorting: ");
        System.out.println(number);

        // Sorting
        Collections.sort(number); // Ascending
        System.out.print("After sorting in ascending order: "+number);

        System.out.println();

        Collections.sort(number, Collections.reverseOrder()); // Descending
        System.out.print("After sorting in descending order: "+number);

    }
}
