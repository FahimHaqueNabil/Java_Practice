package interface_demo;

import super_keyword.A;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dogs can eat egg");
    }
}
