package inheritance;

public class person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }



    void displayInfo1(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }
}
