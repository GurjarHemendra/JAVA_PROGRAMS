package development.NonStaticMembers;
// Non static member i.e non static variable
public class Program1 {

    int a=5; // non static varible
    public static void main(String[] args)
    {
        Program1 obj=new Program1();
        System.out.println(obj);
        System.out.println(obj.a);

    }
}

/*
*  Object creation happen during run time
* */

