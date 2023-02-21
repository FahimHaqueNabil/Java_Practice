package beginnerjava;

public class BreakDemo {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 100; i=i+3){
            if(i==10){
                continue;
                //break;

            }


            System.out.println(i);
        }

    }
}
