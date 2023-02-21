package inheritance;

public class teacher extends person{
    // name, age, displayInfo1()
    //getName(), setName(), getAge(), setAge
    private String qualification;

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }


    void displayInfo2(){
        displayInfo1();
        System.out.println("Qualification: "+getQualification());
    }
}
