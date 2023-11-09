package development.CollectionFramework.Map;

import java.util.HashMap;

public class A {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap();
        map.put(1,"Pendrive");
        map.put(2,"LAptops");
        map.put(null,"iphone");
        map.put(null,null);
        map.put(3,"null");
        System.out.println(map);

        //size
        System.out.println(map.size());
    }
}
