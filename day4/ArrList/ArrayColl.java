package day4.ArrList;

import java.util.ArrayList;

public class ArrayColl implements collectionInterface {
    ArrayList<Integer>al=new ArrayList<>();
    public void create(int n){
        for (int i = n; i < n+5; i++) {
            al.add(i);
        }
        System.out.println("ArrayList created");
    }
    public void read(){
        System.out.println(al);
    }
    public void update(){
        al.add(0,1000);
        System.out.println("Updated");
        System.out.println(al);
    }
    public void delete(){
        int ob=al.remove(0);
        System.out.println("Deleted element:"+ob);
    }
}
