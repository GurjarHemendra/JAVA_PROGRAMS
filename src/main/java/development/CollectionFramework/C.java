package development.CollectionFramework;

import java.util.ArrayList;

public class C {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(1);
        obj.add(3);
        obj.add(4);
        System.out.println(obj);


       for (int i=0;i<obj.size();i++)
       {
           System.out.println(obj.get(i));
       }
        System.out.println("--------------------");

       // ADvanced for loop / for each loop
        for (Object c: obj) {
            System.out.println(c);
        }
        System.out.println("##################");
        // Homogeneous for each loop
        for (Integer i:obj)
        {
            System.out.println(i);
        }
    }
}

// for vs for each loop (assignment in)