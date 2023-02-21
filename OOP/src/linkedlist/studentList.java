package linkedlist;

import java.util.LinkedList;

public class studentList {
    public static void main(String[] args) {
        LinkedList<student> list = new LinkedList<>(); // student linkedList

       // student create
        student s1 = new student(101, "Nabil", "BSC");
        student s2 = new student(103, "Hitman", "BSC");
        student s3 = new student(105, "Fahim", "BSC");
        student s4 = new student(107, "Sama", "BSC");

        // adding student to the studentList
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (student s: list){
            System.out.println(s.id+" - "+s.name+"- "+s.className);
        }

    }
}
