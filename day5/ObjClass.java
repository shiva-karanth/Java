package day5;

import java.util.Objects;

class Project{
    int id;
    String name;
    Project(int id,String name){
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object object){
        Project project=(Project)object;
        if(this.id==project.id && this.name.equals(project.name)){
            return true;
        }
        else{
            return false;
        }
    }
    public int hashCode(){
        return Objects.hash(id,name);
    }
    public String toString(){
        return "Project Id:"+id+"\nProject Name:"+name;
    }
    void displayProject(){
        System.out.println(this.id+" "+this.name);
    }
}
public class ObjClass {
    public static void main(String[] args) {
        Project project=new Project(10, "java");
        Project project2=new Project(10, "java");
        System.out.println(project.hashCode());
        System.out.println(project2.hashCode());
        if(project.hashCode()==project2.hashCode()){
            System.out.println("Hash code are same");
        }
        else{
            System.out.println("Hashcode are different");
        }
        System.out.println(project.equals(project2));
    }
}
