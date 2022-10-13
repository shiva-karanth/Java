import java.util.Iterator;
import java.util.Stack;

public class Stack_DataStructure{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack Elements : "+stack);
        System.out.println("Peek Element in Stack : "+stack.peek());
        System.out.println("Element Removed from Stack : "+stack.pop());

        System.out.println("Printing Stack Elements Using iterator : ");
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Search Operation in Stack
        int pos = stack.search(1);
        if(pos==-1){
            System.out.println("Searched Element not found");
        }else{
            System.out.println("Element found at pos : "+pos);
        };
    }
}