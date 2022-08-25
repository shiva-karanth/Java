package p1;
import java.util.*;
public class test1 {

    public static void main(String[] args) {
        int[] a;
        a=new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
    
}