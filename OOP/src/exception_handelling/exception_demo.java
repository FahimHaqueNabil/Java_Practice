package exception_handelling;

public class exception_demo {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x/y;
          System.out.println(result);
        }catch (Exception e1){
            System.out.println("Exception: "+e1);
        }
        finally {
            System.out.println("finally block will always be executed");
        }
        System.out.println("Last line of the program...");

    }
}
