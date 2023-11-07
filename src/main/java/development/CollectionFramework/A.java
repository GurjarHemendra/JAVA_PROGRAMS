package development.CollectionFramework;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        System.out.println(obj.isEmpty());
        obj.add(1); // add(Object e); : used to add the object in the arraylist
        obj.add(2);
        obj.add('a');
        obj.add(true);
        System.out.println(obj);

        // isEmpty() ;
        System.out.println(obj.isEmpty());
        //size();
        System.out.println(obj.size());
        // get();
        System.out.println(obj.get(3));
        // contain()
        System.out.println("----------------------");
        System.out.println(obj.contains(1));
        // indexof
        System.out.println(obj.indexOf(2));


        ArrayList obj1=new ArrayList();
        obj1.add(0);
        obj1.add(1);
        obj1.add(2);
        System.out.println("-----******---");
        System.out.println(obj1.indexOf(1));

        // addAll() :
        System.out.println("arralist 1 "+obj);
        System.out.println("arraylist 2 "+obj1);
        obj.addAll(obj1);
        System.out.println("updated arrlist 1 "+obj);
        System.out.println("updated arrlist 2 "+obj1);
        obj1.addAll(obj);
        System.out.println("updated arrlist 1 "+obj);
        System.out.println("updated arrlist 2 "+obj1);


        // if you want to add object at a parrticular index
        obj.add(4,"samosa");
        System.out.println(obj);

        // you can add collection at a particular index
        // TRY BY YOURSELF   obj.addAll()
    }
}
