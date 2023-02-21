package oop;

public class Teacher_test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Fahim Haque Nabil", "male", 341);
        Teacher teacher2 = new Teacher("Hitman sama", "male", 9898);

//        teacher1.name = "Fahim Haque Nabil";
//        teacher1.gender= "male";
//        teacher1.phone = 341;

        //teacher1.setInformation("Fahim Haque Nabil", "male", 341);

//        teacher2.name = "Hitman sama";
//        teacher2.gender= "male";
//        teacher2.phone = 9898;

        //teacher2.setInformation("Hitman sama", "male", 9898);

        teacher1.displayInformation();
        teacher2.displayInformation();

        
        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();

//        System.out.println("Name: "+teacher1.name+", Gender: "+teacher1.gender +", Phone: "+teacher1.phone);
//        System.out.println("Name: "+teacher2.name+", Gender: "+teacher2.gender +", Phone: "+teacher2.phone);


    }
}
