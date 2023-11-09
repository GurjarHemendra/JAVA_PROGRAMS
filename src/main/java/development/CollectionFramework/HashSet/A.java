package development.CollectionFramework.HashSet;

import java.util.HashSet;

public class A {
    public static void main(String[] args) {
        HashSet obj=new HashSet();
        obj.add(1);
        obj.add(3);
        obj.add(3);
        obj.add('a');
        obj.add("true");
        System.out.println(obj.isEmpty());
    }
}
