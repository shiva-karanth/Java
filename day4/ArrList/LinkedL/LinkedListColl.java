package day4.ArrList.LinkedL;

import java.util.HashSet;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.LinkedList;
// import java.util.Vector;
// import java.util.PriorityQueue;

public class LinkedListColl implements CollectionInterfaceLinkedList {
    // LinkedList<Integer>ll=new LinkedList<>();
    // Vector<Integer>ll=new Vector<>();
    // HashMap<Integer,String> ll=new HashMap<Integer,String>();
    // PriorityQueue<Integer> ll=new PriorityQueue<Integer>();
    
    HashSet<Integer>ll=new HashSet<Integer>();
    public void create(int n){
        // for (int i = 0; i < n; i++) {
        //     ll.put(i,"a");
        // }
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
    }
    public void read(){
        for (Integer integer : ll) {
            System.out.println(integer);
        }

        // for (Map.Entry<Integer,String> data : ll.entrySet()) {
        //     System.out.println(data.getKey()+" "+data.getValue());
        // }

        // System.out.println(ll);
    }
    public void update(){
        // ll.put(1,"bruh");
        // System.out.println(ll);
        // ll.add(0,1);
        ll.add(69);
        System.out.println("Update operation successfull");
    }
    public void delete(){
        ll.remove(0);
        System.out.println(ll);
    }
}