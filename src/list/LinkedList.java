package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();

        //adding or inserting data
        list1.add(24);
        list1.add(1);
        list1.add(33);
        list1.add(39);
        list1.add(23);
        list1.add(4);
        list1.add(8);

        System.out.println("list is :" +list1);

        // remove data
        list1.remove(2);
        System.out.println("list1 after removing index 2 :" + list1);

        // search the data at specific postion
        System.out.println("list1 element at 4th index :" +list1.get(4));
        System.out.println("list1 element at 1st index :" +list1.get(1));

        // update the data
        list1.set(3, 88);
        System.out.println("list1 after updating the 3rd index data :" + list1);

        //size of the list
        System.out.println("list1 length of the list :" + list1.size());

        //sort the list;
        Collections.sort(list1);
        System.out.println("list1 after sorting :" +list1);

        //traversing the list
        System.out.println("traversing using foreach loop");
        for (Integer i:list1){
            System.out.println(i);
        }
        // iterator
        System.out.println("Using Iterator to traverse the list1");
        Iterator itr1 = list1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
