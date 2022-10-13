import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for(int i=0;i<5;i++){
            ll.add(i);
        }

        System.out.println("Elements of Linked List : "+ll);
        System.out.println("First Element : "+ll.getFirst());
        System.out.println("Last Element : "+ll.getLast());
        System.out.println("Removed element : "+ll.pop());

        System.out.println("Printing LinkedList Elements Using iterator : ");
        Iterator iterator = ll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}