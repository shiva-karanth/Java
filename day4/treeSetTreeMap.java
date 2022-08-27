package day4;

import java.util.TreeMap;
import java.util.TreeSet;

public class treeSetTreeMap {
    public static void main(String[] args) {
        // Sorts the ele and doesnt allow duplicate values
        TreeSet<Integer>treeSet=new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(8);
        treeSet.add(5);
        treeSet.add(3);
        System.out.println(treeSet);
        // Sorts the eles and stores in maps form
        TreeMap<Integer,String>treeMap=new TreeMap<Integer,String>();
        treeMap.put(69, "kini");
        treeMap.put(1, "kini Prajwal");
        treeMap.put(87, "Prajwal kini");
        treeMap.put(6, "kini");
        treeMap.put(69, "kini");
        System.out.println(treeMap);
    }
}
