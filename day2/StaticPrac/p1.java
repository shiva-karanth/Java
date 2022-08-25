package day2.StaticPrac;

public class p1 {
    public static void demo() {
        System.out.println(1);
    }

    public static void demo(int a) {
        demo();
        System.out.println(2);
    }

    public static void demo(String s) {
        System.out.println(3);
    }

    public static void demo(int a, int b) {
        System.out.println(4);
    }

    public static void demo(String s, int a) {
        System.out.println(5);
    }

    public static void demo(int a, String s) {
        System.out.println(6);
    }

    public static void main(String[] args) {
        demo();
        demo(2);
        demo("k");
        demo(1, 2);
        demo("p", 2);
        demo(90, "i");
    }
}
