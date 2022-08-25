package day3;
class Student{
    private int id;
    private String name;
    private String mail;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}

public class encaps {
    public static void main(String[] args) {
        Student student=new Student();
        student.setId(69);
        student.setName("ashwin");
        student.setMail("gg@mail.com");
        System.out.println(student.getId()+"\n"+student.getName()+"\n"+student.getMail());
    }
    
}