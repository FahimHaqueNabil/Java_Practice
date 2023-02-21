package super_keyword3;

public class car extends vehicle{
    // color, weight, attribute()
    int gear;

    car(String c, double w, int g){
        super(c, w); // calling constructor of vehicle class
        gear = g;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Gear: "+gear);
    }
}
