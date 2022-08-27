package Task;

class Project{
    private int id;
    private String name;
    void displayProjectDetails(){
        System.out.println("Project ID:"+id+"\nProject Name:"+name);
    }

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

}
class Student{
    static Project p=new Project();
    public static void createTheProject(int id,String name){
        if(p==null){
            p.setId(id);
            p.setName(name);
        }
    }
    public static void readTheProject(){
        if(p!=null){
            System.out.println(p.getId()+" "+p.getName());
        }
        else
            System.out.println("No Poject");
    }
    public static void updateTheProject(int id,String name) {
        if(p!=null){
            p.setId(id);
            p.setName(name);
        }
    }
    public static void deleteTheProject(){
        p=null;
    }
}
public class task4 {
    public static void main(String[] args) {
        // Student.createTheProject(10,"Ashwin");
        // Student.readTheProject();
        // Student.updateTheProject(2, "New Name");
        // Student.deleteTheProject();
        // Student.readTheProject();
        Student s=new Student();
        s.createTheProject(1, "hwllo");
        s.readTheProject();
    }
}
