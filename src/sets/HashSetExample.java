package sets;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
       HashSet<String>  hastSet1 = new HashSet<>();

       hastSet1.add("Mango");
        hastSet1.add("Orange");
        hastSet1.add("Banana");
        hastSet1.add("Apple");
        hastSet1.add("Guava");
        hastSet1.add(null);
        hastSet1.add(null);

        System.out.println(hastSet1);

        //remove
        hastSet1.remove("Apple");
        System.out.println("hashset1 content after removing :" +hastSet1);

        //size of the set
        System.out.println("size of the hashset1 :" + hastSet1.size());

        //traversing the hashset1
        //foreach way
        System.out.println("Using foreach loot to traverse the hashset1");
        for(String setElement : hastSet1){
            System.out.println(setElement);
        }

        //test code
        //iterator
        System.out.println("Using Iterator to traverse the hashset1");
        Iterator itr1 = hastSet1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
