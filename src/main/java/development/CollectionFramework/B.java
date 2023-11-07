package development.CollectionFramework;

import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add(2);
        obj.add("vadapao");
        obj.add(false);

        // remove
        System.out.println(obj);
        obj.remove(2);// remove(int index)
        System.out.println(obj);
        obj.remove("vadapao");
        System.out.println(obj);

        ArrayList n=new ArrayList();
        n.add(1);
        n.add(2);
        n.add(3);
      // lets remove 2nd index
        n.remove(Integer.valueOf(2));
        System.out.println("-----------------------");
        System.out.println(n);

    }
}
