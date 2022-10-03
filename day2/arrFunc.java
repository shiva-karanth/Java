package day2;

public class arrFunc {

    
    public static void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        displayArray(a);
        
        int[] b = new int[3];
        b[0] = 1;
        b[1] = 10;
        b[2] = 100;
        displayArray(b);
    }
}
