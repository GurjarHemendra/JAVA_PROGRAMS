package Programming;

import java.util.Arrays;

public class ArrayProgram1 {
    public static void main(String[] args) {
        // 1st way to use array : initialisation and declaration

        int a[]={10,9,8,7,11,13};
        System.out.println(a);
        // accessing the value of an array
        System.out.println(a[1]);
        System.out.println(a[4]);
        System.out.println(a[5]);
//        System.out.println(a[6]);  ArrayIndexOutOfBoundsException


        // length
        System.out.println("length of array is "+a.length);

        Arrays.sort(a);

        // print array with for loop
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        // change tha value a[2]=18;
    }
}
