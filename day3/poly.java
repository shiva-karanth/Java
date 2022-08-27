package day3;
class A{
    public void demo(){
        System.out.println("Demo of A");
    }
}
class B extends A{
    @Override
    public void demo(){
        System.out.println("Demo of B");
    }
}
public class poly {
    public static void main(String[] args) {
        A a=new A();
        a.demo();
        B b=new B();
        b.demo();
        // upcasting:
        A a2=new B();
        a2.demo();
        // 
        
    }
}
