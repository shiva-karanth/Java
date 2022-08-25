package day2;

class Test{
    int id;
    String name;
    public Test(){
        System.out.println(1);
    }
    public Test(int id){
        this.id=id;
        System.out.println(2);
    }
    public Test(String name){
        this.name=name;
        System.out.println(3);
    }
    public Test(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println(4);
    }
}

public class constr {
    public static void main(String[] args) {
        Test t=new Test();
        Test t2=new Test(1);
        Test t3=new Test("abc");
        Test t4=new Test("poc",45);
    }
}