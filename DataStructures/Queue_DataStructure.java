import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_DataStructure {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Elements of the Queue : "+queue);
        System.out.println("Peek Element of of the Queue : "+queue.peek());
        System.out.println("Size of Queue : "+queue.size());
        System.out.println("Removed Element from Queue : "+queue.remove());

        System.out.println("Printing Queue Elements Using iterator : ");
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}