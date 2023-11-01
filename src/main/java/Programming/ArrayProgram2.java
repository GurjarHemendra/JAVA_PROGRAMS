package Programming;

public class ArrayProgram2 {
    public static void main(String[] args) {
        int []a=new int[5];
        System.out.println(a);
        System.out.println(a[0]);

        // giving value to 1st index
        a[1]=10;

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}

/*
* 1. check the default vallue for the remaining types of array
* */