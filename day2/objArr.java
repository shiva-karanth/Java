package day2;

class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class objArr {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("kini", 69);
        students[1]=new Student("prajwal", 69);
        students[2]=new Student("kini prajwal", 69);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Kini name:"+students[i].name);
            System.out.println("Kini age:"+students[i].age);
            System.out.println("-----------------------------------------------");
        }
    }
}
