package Task;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int a[][][] = new int[2][2][2];
        int b[][][] = new int[2][2][2];
        int c[][][] = new int[2][2][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A elements");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Enter B elements");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    b[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    c[i][j][k] = a[i][j][k] * b[i][j][k];
                }
            }
        }
        System.out.println("Elements of C");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    System.out.println(c[i][j][k]);
                }
            }
        }
    }
}
