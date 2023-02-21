package problem2;

public class Circle extends Shape{
    // dim1, dim2
    Circle(double r){
        super(r,r);
    }

    @Override
    void area() {
        double result = Math.PI * dim1 * dim2;
        System.out.printf("Circle: %.2f", result);
    }
}
