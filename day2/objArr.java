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
        students[0]=new Student("PP", 20);
        students[1]=new Student("PPS", 20);
        students[2]=new Student("PSP", 40);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name:"+students[i].name);
            System.out.println("Age:"+students[i].age);
            System.out.println("-----------------------------------");
        }
    }
}
