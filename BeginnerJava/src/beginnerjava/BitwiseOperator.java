package beginnerjava;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 32, b=10, c;

        c = a&b;
        System.out.println("a & b: "+c);

        c = a|b;
        System.out.println("a | b: "+c);

        c = a^b; // Xor
        System.out.println("a ^ b: "+c);

        c = a>>2; //right shift
        System.out.println("a >> 2: "+c);

        c = a>>3; //right shift
        System.out.println("a >> 3: "+c);

        c = b<<2; //left shift
        System.out.println("a << 2: "+c);
    }
}



