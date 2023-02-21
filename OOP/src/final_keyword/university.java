package final_keyword;

public class university {
    final String UNIVERSITY_NAME = "UIU"; //can't be changed in future
    final int FEES; // blank final variable
    static final int fee;

    university(){
        FEES = 10000;
    }

    static {
        fee = 500;
    }

    void display(){
        System.out.println(UNIVERSITY_NAME);
        System.out.println(FEES);
        System.out.println(fee);
    }
}
