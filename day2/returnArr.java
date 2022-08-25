package day2;

public class returnArr {
    public static void main(String[] args) {
        int[] res=new int[3];
        res=returnA();
        for (int i : res) {
            System.out.println(i);
        }
    }
    public static int[] returnA() {
        int[] a=new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
        }
        return a;
    }
}
