package arraydemo;

public class Array1 {
    public static void main(String[] args) {
        int[] number = new int[5];
        int[] number2 = new int[15];

        number[0] = 10;
        number[1] = 30;
        number[2] = 50;
        number[3] = 40;
        number[4] = 20;

        int len = number.length;
        int sum = number[0] + number[1] + number[2] + number[3]  + number[4];

        System.out.println("Length of Array: "+len);
        System.out.println("Sum: "+sum);
        System.out.println(number[3]);

    }
}
