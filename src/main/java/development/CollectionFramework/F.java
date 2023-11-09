package development.CollectionFramework;

import java.util.ArrayList;

public class F {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(2);
        obj.add(5);
        obj.add(3);
        obj.add(1);
        //removeALl and retainAll
        ArrayList obj1=new ArrayList();
        obj1.add('a');
        obj1.add(5);
        obj1.add(3);
        obj1.add("Poha");

        // removeAll
        System.out.println(obj);
        System.out.println(obj1);
        obj.removeAll(obj1);
        System.out.println("arrlist 1 :  "+obj);
        System.out.println("arraylist 2 : "+obj1);
    }
}
