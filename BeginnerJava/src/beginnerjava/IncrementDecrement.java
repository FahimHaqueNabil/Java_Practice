package beginnerjava;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x=25, m= 25, y,  z, n;

        y = x++;
        System.out.println("Y: "+y);
        y = x++;
        System.out.println("Y: "+y);
        y = x++;
        System.out.println("Y: "+y);
        z = x;
        System.out.println("Z: "+z);

        n = ++m;
        System.out.println("N: "+n);
        n = m;
        System.out.println("N: "+n);

    }
}
