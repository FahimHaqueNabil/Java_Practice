package beginnerjava;

public class OthersToDecimal {
    public static void main(String[] args) {
        // Binary ---> Decimal
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: "+decimal);

        // Octal ---> Decimal
        String octal = "675";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println("Decimal: "+decimal2);

        // Hexadecimal ---> Decimal
        String hexa = "B";
        Integer decimal3 = Integer.parseInt(hexa, 16);
        System.out.println("Decimal: "+decimal3);

    }
}
