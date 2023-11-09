package development.CollectionFramework;

import java.util.ArrayList;

//can we convert arraylist into array
public class E {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(10);
        obj.add(20);
        obj.add(30);

        // array
        Object[] a =obj.toArray();
        System.out.println(a.length);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
