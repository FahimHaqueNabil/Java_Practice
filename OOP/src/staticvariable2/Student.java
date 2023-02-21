package staticvariable2;

public class Student {
    static int count = 0;

    Student(){
        count++;
    }

    void display(){
        System.out.println("Total student: "+count);
    }
}
