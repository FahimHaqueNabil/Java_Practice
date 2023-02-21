package beginnerjava;

public class MathDemo {
    public static void main(String[] args) {
        int x = 20, y = -10, result;
        double power;

        result = Math.max(x, y);
        System.out.println("Maximum: "+result);

        result = Math.min(x, y);
        System.out.println("Minimum: "+result);

        result = Math.abs(y);
        System.out.println("Absolute of Y: "+result);

        power = Math.pow(2,4);
        System.out.println("Power: "+power);

        int round = Math.round(8.8f);
        System.out.println("Round of 8.8: "+round);

        double pi = Math.PI;
        System.out.println("PI: "+pi);

    }
}
