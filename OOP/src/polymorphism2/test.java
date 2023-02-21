package polymorphism2;

public class test {
    public static void main(String[] args) {
//        Shape s1 = new Shape();
//        Shape s2 = new Rectangle(10, 20);
//        Shape s3 = new Triangle(10,20);

//        System.out.println("Shape: "+s1.area());
//        System.out.println("Rectangle: "+s2.area());
//        System.out.println("Triangle: "+s3.area());

        Shape [] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle(10, 20);
        s[2] = new Triangle(10,20);

        for (int i = 0; i < 3; i++){
            System.out.println(s[i].area());
        }
    }
}
