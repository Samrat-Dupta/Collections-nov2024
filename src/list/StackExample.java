package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        // adding the data
        stack1.push(20);
        stack1.push(89);
        stack1.push(22);
        stack1.push(7);
        stack1.push(5);
        stack1.push(9);
        System.out.println("stack1 is :" + stack1);

        // remoing data
        stack1.pop();
        System.out.println("stack1 after 1st pop :" +stack1);
        stack1.pop();
        System.out.println("stack1 after 2nd pop :" +stack1);

        Collections.sort(stack1);
        System.out.println("after sorting stk1 : "+stack1);

        // size of stk1
        System.out.println("size of stk1 is :" +stack1.size());

        // traversing the stk1
        // foreach way
        System.out.println("Using foreach loop to traverse the stk1");
        for(Integer listElement :stack1){
            System.out.println(listElement);
        }
        // new new lines// new new lines

        // iterator
        System.out.println("Using Iterator to traverse the stk1");
        Iterator itr1 = stack1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
