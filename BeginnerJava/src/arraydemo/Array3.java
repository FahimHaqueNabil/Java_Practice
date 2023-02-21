package arraydemo;

public class Array3 {
    public static void main(String[] args) {
        int[][] num = new int[2][3];

        num[0][0] = 10;
        num[0][1] = 20;
        num[0][2] = 30;
        num[1][0] = 40;
        num[1][1] = 50;
        num[1][2] = 60;

        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);
        System.out.println(num[1][0]);
        System.out.println(num[1][1]);
        System.out.println(num[1][2]);

        for (int row = 0; row< 2; row++){
            for (int col = 0; col < 3; col++){
                System.out.print(" "+num[row][col]);
            }
            System.out.println();
        }

    }
}
