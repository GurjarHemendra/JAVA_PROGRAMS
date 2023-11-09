package development.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class D {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
        obj.add(2);
        obj.add(5);
        obj.add(3);
        obj.add(1);

        Collections.sort(obj);
        System.out.println(obj);

        Collections.reverse(obj);
        System.out.println(obj);
    }
}
