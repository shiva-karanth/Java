package Task;
import java.util.Scanner;

public class task2d {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("*******************************************");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] % b[i][j];
            }
        }
        System.out.println("*************************************");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.println(c[i][j]);
            }
        }
        sc.close();

    }
}
