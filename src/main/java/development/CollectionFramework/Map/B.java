package development.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class B {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap();
        map.put(1,"Pendrive");
        map.put(2,"LAptops");

        map.put(2,"MAcbook");
        map.put(3,"MAcbook");
        System.out.println(map);

        HashMap<Integer,String> map1=new HashMap();
        map1.put(1,"TAjmahal");
        map1.put(2,"kutubminar");

        System.out.println(map1.containsKey(2));; // true
        System.out.println(map1.containsKey(3));; //false

        //containsvalue
        System.out.println(map1.containsValue("TAjmahal"));

        //get(key) : return the value corresponding to key
        System.out.println(map1.get(1));

        //keyset() : return the set of key
        System.out.println(map1.keySet());;

        //entryset():
        System.out.println(map1.entrySet());

        //isEmpty()  : to check hashmap is empty or not
        //putAll() ;


        HashMap<Integer,String> a=new HashMap();
        a.put(1,"Pendrive");
        a.put(2,"LAptops");

        a.put(2,"MAcbook");
        a.put(3,"MAcbook");
        System.out.println(map);

        HashMap<Integer,String> b=new HashMap();
        b.put(4,"TAjmahal");
        b.put(5,"kutubminar");
        System.out.println(a);
        System.out.println(b);
        a.putAll(b);
        System.out.println(a);
        System.out.println(b);

        // for each loop for hashmap
        for (HashMap.Entry<Integer,String> s: a.entrySet()) {
            System.out.println("Key :"+s.getKey()+", value : "+ s.getValue());
        }

        System.out.println(b.values());
    }
}
