package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHahmap {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        // adding the elements to LinkedHashMap
        map1.put(102,"Mango");
        map1.put(105,"Guava");
        map1.put(101,"Banana");
        map1.put(null,"Orange");
        map1.put(104,"Mango");
        map1.put(103,"Mango");
        map1.put(104,"Pineapple");// this will be added

        System.out.println("map1 is : "+map1);

        System.out.println("get element at key 102:"+map1.get(102));

        map1.remove(null);
        System.out.println("after removing null key:"+map1);

        // traversing
        System.out.println("traversing using foreach loop");
        for(Map.Entry m1:map1.entrySet()){
            System.out.println(m1.getKey()+"-------------"+m1.getValue());
        }
    }
}
