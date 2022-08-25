package Task;
import java.util.*;
public class task1c {
    public static void main(String[] args) {
        int a[]=new int[2];
        int b[]=new int[2];
        int c[]=new int[a.length];
        
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < c.length; i++) {
            a[i]=sc.nextInt();
            System.out.println("***********************************");
            b[i]=sc.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            c[i]=a[i]-b[i];
        }
        for (int i : c) {
            System.out.println(i);
        }
    }
}
